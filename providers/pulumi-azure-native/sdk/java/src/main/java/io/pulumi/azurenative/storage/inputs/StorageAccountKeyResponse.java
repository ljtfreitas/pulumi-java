// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * An access key for the storage account.
 * 
 */
public final class StorageAccountKeyResponse extends io.pulumi.resources.InvokeArgs {

    public static final StorageAccountKeyResponse Empty = new StorageAccountKeyResponse();

    /**
     * Creation time of the key, in round trip date format.
     * 
     */
    @InputImport(name="creationTime", required=true)
    private final String creationTime;

    public String getCreationTime() {
        return this.creationTime;
    }

    /**
     * Name of the key.
     * 
     */
    @InputImport(name="keyName", required=true)
    private final String keyName;

    public String getKeyName() {
        return this.keyName;
    }

    /**
     * Permissions for the key -- read-only or full permissions.
     * 
     */
    @InputImport(name="permissions", required=true)
    private final String permissions;

    public String getPermissions() {
        return this.permissions;
    }

    /**
     * Base 64-encoded value of the key.
     * 
     */
    @InputImport(name="value", required=true)
    private final String value;

    public String getValue() {
        return this.value;
    }

    public StorageAccountKeyResponse(
        String creationTime,
        String keyName,
        String permissions,
        String value) {
        this.creationTime = Objects.requireNonNull(creationTime, "expected parameter 'creationTime' to be non-null");
        this.keyName = Objects.requireNonNull(keyName, "expected parameter 'keyName' to be non-null");
        this.permissions = Objects.requireNonNull(permissions, "expected parameter 'permissions' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private StorageAccountKeyResponse() {
        this.creationTime = null;
        this.keyName = null;
        this.permissions = null;
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageAccountKeyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String creationTime;
        private String keyName;
        private String permissions;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageAccountKeyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationTime = defaults.creationTime;
    	      this.keyName = defaults.keyName;
    	      this.permissions = defaults.permissions;
    	      this.value = defaults.value;
        }

        public Builder setCreationTime(String creationTime) {
            this.creationTime = Objects.requireNonNull(creationTime);
            return this;
        }

        public Builder setKeyName(String keyName) {
            this.keyName = Objects.requireNonNull(keyName);
            return this;
        }

        public Builder setPermissions(String permissions) {
            this.permissions = Objects.requireNonNull(permissions);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public StorageAccountKeyResponse build() {
            return new StorageAccountKeyResponse(creationTime, keyName, permissions, value);
        }
    }
}
