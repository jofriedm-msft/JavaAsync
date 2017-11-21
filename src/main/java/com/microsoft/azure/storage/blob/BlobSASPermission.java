package com.microsoft.azure.storage.blob;

import java.util.EnumSet;

/**
 * Specifies the set of possible permissions for a blob shared access policy.
 */
public enum BlobSASPermission {
    /**
     * Specifies Read access granted.
     */
    READ('r'),

    /**
     * Specifies Add access granted.
     */
    ADD('a'),

    /**
     * Specifies Create access granted.
     */
    CREATE('c'),

    /**
     * Specifies Write access granted.
     */
    WRITE('w'),

    /**
     * Specifies Delete access granted.
     */
    DELETE('d');

    final private char value;

    /**
     * Create a <code>BlobSASPermissions</code>.
     *
     * @param c
     *            The <code>char</code> which represents this permission.
     */
    private BlobSASPermission(char c) {
        this.value = c;
    }

    /**
     * Converts the given permissions to a <code>String</code>.
     *
     * @param permissions
     *            The permissions to convert to a <code>String</code>.
     *
     * @return A <code>String</code> which represents the <code>BlobSASPermission</code>.
     */
    static String permissionsToString(EnumSet<BlobSASPermission> permissions) {
        if (permissions == null) {
            return Constants.EMPTY_STRING;
        }

        // The service supports a fixed order => racwdl
        final StringBuilder builder = new StringBuilder();

        if (permissions.contains(BlobSASPermission.READ)) {
            builder.append("r");
        }

        if (permissions.contains(BlobSASPermission.ADD)) {
            builder.append("a");
        }

        if (permissions.contains(BlobSASPermission.CREATE)) {
            builder.append("c");
        }

        if (permissions.contains(BlobSASPermission.WRITE)) {
            builder.append("w");
        }

        if (permissions.contains(BlobSASPermission.DELETE)) {
            builder.append("d");
        }

        return builder.toString();
    }

    /**
     * Creates an {@link EnumSet<BlobSASPermission>} from the specified permissions string.
     *
     * @param permString
     *            A <code>String</code> which represents the <code>BlobSASPermission</code>.
     * @return A {@link EnumSet<BlobSASPermission>} generated from the given <code>String</code>.
     */
    static EnumSet<BlobSASPermission> permissionsFromString(String permString) {
        EnumSet<BlobSASPermission> permissions = EnumSet.noneOf(BlobSASPermission.class);

        for (final char c : permString.toLowerCase().toCharArray()) {
            boolean invalidCharacter = true;

            for (BlobSASPermission perm : BlobSASPermission.values()) {
                if (c == perm.value) {
                    permissions.add(perm);
                    invalidCharacter = false;
                    break;
                }

            }

            if (invalidCharacter) {
                throw new IllegalArgumentException(
                        String.format(SR.ENUM_COULD_NOT_BE_PARSED, "Permissions", permString));
            }
        }

        return permissions;
    }
}
