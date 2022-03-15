// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagecache.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Active Directory admin credentials used to join the HPC Cache to a domain.
 * 
 */
public final class CacheActiveDirectorySettingsResponseCredentials extends io.pulumi.resources.InvokeArgs {

    public static final CacheActiveDirectorySettingsResponseCredentials Empty = new CacheActiveDirectorySettingsResponseCredentials();

    /**
     * Plain text password of the Active Directory domain administrator. This value is stored encrypted and not returned on response.
     * 
     */
    @Import(name="password", required=true)
      private final String password;

    public String getPassword() {
        return this.password;
    }

    /**
     * Username of the Active Directory domain administrator. This value is stored encrypted and not returned on response.
     * 
     */
    @Import(name="username", required=true)
      private final String username;

    public String getUsername() {
        return this.username;
    }

    public CacheActiveDirectorySettingsResponseCredentials(
        String password,
        String username) {
        this.password = Objects.requireNonNull(password, "expected parameter 'password' to be non-null");
        this.username = Objects.requireNonNull(username, "expected parameter 'username' to be non-null");
    }

    private CacheActiveDirectorySettingsResponseCredentials() {
        this.password = null;
        this.username = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CacheActiveDirectorySettingsResponseCredentials defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String password;
        private String username;

        public Builder() {
    	      // Empty
        }

        public Builder(CacheActiveDirectorySettingsResponseCredentials defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.username = defaults.username;
        }

        public Builder password(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }

        public Builder username(String username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }
        public CacheActiveDirectorySettingsResponseCredentials build() {
            return new CacheActiveDirectorySettingsResponseCredentials(password, username);
        }
    }
}
