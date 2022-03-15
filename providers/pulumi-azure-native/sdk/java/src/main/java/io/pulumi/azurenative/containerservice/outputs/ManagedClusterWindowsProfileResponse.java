// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ManagedClusterWindowsProfileResponse {
    /**
     * Specifies the password of the administrator account. <br><br> **Minimum-length:** 8 characters <br><br> **Max-length:** 123 characters <br><br> **Complexity requirements:** 3 out of 4 conditions below need to be fulfilled <br> Has lower characters <br>Has upper characters <br> Has a digit <br> Has a special character (Regex match [\W_]) <br><br> **Disallowed values:** "abc@123", "P@$$w0rd", "P@ssw0rd", "P@ssword123", "Pa$$word", "pass@word1", "Password!", "Password1", "Password22", "iloveyou!"
     * 
     */
    private final @Nullable String adminPassword;
    /**
     * Specifies the name of the administrator account. <br><br> **restriction:** Cannot end in "." <br><br> **Disallowed values:** "administrator", "admin", "user", "user1", "test", "user2", "test1", "user3", "admin1", "1", "123", "a", "actuser", "adm", "admin2", "aspnet", "backup", "console", "david", "guest", "john", "owner", "root", "server", "sql", "support", "support_388945a0", "sys", "test2", "test3", "user4", "user5". <br><br> **Minimum-length:** 1 character <br><br> **Max-length:** 20 characters
     * 
     */
    private final String adminUsername;
    /**
     * Whether to enable CSI proxy.
     * 
     */
    private final @Nullable Boolean enableCSIProxy;
    /**
     * The licenseType to use for Windows VMs. Windows_Server is used to enable Azure Hybrid User Benefits for Windows VMs.
     * 
     */
    private final @Nullable String licenseType;

    @CustomType.Constructor
    private ManagedClusterWindowsProfileResponse(
        @CustomType.Parameter("adminPassword") @Nullable String adminPassword,
        @CustomType.Parameter("adminUsername") String adminUsername,
        @CustomType.Parameter("enableCSIProxy") @Nullable Boolean enableCSIProxy,
        @CustomType.Parameter("licenseType") @Nullable String licenseType) {
        this.adminPassword = adminPassword;
        this.adminUsername = adminUsername;
        this.enableCSIProxy = enableCSIProxy;
        this.licenseType = licenseType;
    }

    /**
     * Specifies the password of the administrator account. <br><br> **Minimum-length:** 8 characters <br><br> **Max-length:** 123 characters <br><br> **Complexity requirements:** 3 out of 4 conditions below need to be fulfilled <br> Has lower characters <br>Has upper characters <br> Has a digit <br> Has a special character (Regex match [\W_]) <br><br> **Disallowed values:** "abc@123", "P@$$w0rd", "P@ssw0rd", "P@ssword123", "Pa$$word", "pass@word1", "Password!", "Password1", "Password22", "iloveyou!"
     * 
    */
    public Optional<String> getAdminPassword() {
        return Optional.ofNullable(this.adminPassword);
    }
    /**
     * Specifies the name of the administrator account. <br><br> **restriction:** Cannot end in "." <br><br> **Disallowed values:** "administrator", "admin", "user", "user1", "test", "user2", "test1", "user3", "admin1", "1", "123", "a", "actuser", "adm", "admin2", "aspnet", "backup", "console", "david", "guest", "john", "owner", "root", "server", "sql", "support", "support_388945a0", "sys", "test2", "test3", "user4", "user5". <br><br> **Minimum-length:** 1 character <br><br> **Max-length:** 20 characters
     * 
    */
    public String getAdminUsername() {
        return this.adminUsername;
    }
    /**
     * Whether to enable CSI proxy.
     * 
    */
    public Optional<Boolean> getEnableCSIProxy() {
        return Optional.ofNullable(this.enableCSIProxy);
    }
    /**
     * The licenseType to use for Windows VMs. Windows_Server is used to enable Azure Hybrid User Benefits for Windows VMs.
     * 
    */
    public Optional<String> getLicenseType() {
        return Optional.ofNullable(this.licenseType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedClusterWindowsProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String adminPassword;
        private String adminUsername;
        private @Nullable Boolean enableCSIProxy;
        private @Nullable String licenseType;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedClusterWindowsProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adminPassword = defaults.adminPassword;
    	      this.adminUsername = defaults.adminUsername;
    	      this.enableCSIProxy = defaults.enableCSIProxy;
    	      this.licenseType = defaults.licenseType;
        }

        public Builder adminPassword(@Nullable String adminPassword) {
            this.adminPassword = adminPassword;
            return this;
        }

        public Builder adminUsername(String adminUsername) {
            this.adminUsername = Objects.requireNonNull(adminUsername);
            return this;
        }

        public Builder enableCSIProxy(@Nullable Boolean enableCSIProxy) {
            this.enableCSIProxy = enableCSIProxy;
            return this;
        }

        public Builder licenseType(@Nullable String licenseType) {
            this.licenseType = licenseType;
            return this;
        }
        public ManagedClusterWindowsProfileResponse build() {
            return new ManagedClusterWindowsProfileResponse(adminPassword, adminUsername, enableCSIProxy, licenseType);
        }
    }
}
