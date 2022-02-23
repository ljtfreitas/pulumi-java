// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class KeyResponse {
    /**
     * Automation key name.
     * 
     */
    private final String keyName;
    /**
     * Automation key permissions.
     * 
     */
    private final String permissions;
    /**
     * Value of the Automation Key used for registration.
     * 
     */
    private final String value;

    @OutputCustomType.Constructor({"keyName","permissions","value"})
    private KeyResponse(
        String keyName,
        String permissions,
        String value) {
        this.keyName = Objects.requireNonNull(keyName);
        this.permissions = Objects.requireNonNull(permissions);
        this.value = Objects.requireNonNull(value);
    }

    /**
     * Automation key name.
     * 
     */
    public String getKeyName() {
        return this.keyName;
    }
    /**
     * Automation key permissions.
     * 
     */
    public String getPermissions() {
        return this.permissions;
    }
    /**
     * Value of the Automation Key used for registration.
     * 
     */
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String keyName;
        private String permissions;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyName = defaults.keyName;
    	      this.permissions = defaults.permissions;
    	      this.value = defaults.value;
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
        public KeyResponse build() {
            return new KeyResponse(keyName, permissions, value);
        }
    }
}
