// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hanaonazure.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OSProfileResponse {
    /**
     * Specifies the host OS name of the HANA instance.
     * 
     */
    private final @Nullable String computerName;
    /**
     * This property allows you to specify the type of the OS.
     * 
     */
    private final String osType;
    /**
     * Specifies the SSH public key used to access the operating system.
     * 
     */
    private final @Nullable String sshPublicKey;
    /**
     * Specifies version of operating system.
     * 
     */
    private final String version;

    @CustomType.Constructor
    private OSProfileResponse(
        @CustomType.Parameter("computerName") @Nullable String computerName,
        @CustomType.Parameter("osType") String osType,
        @CustomType.Parameter("sshPublicKey") @Nullable String sshPublicKey,
        @CustomType.Parameter("version") String version) {
        this.computerName = computerName;
        this.osType = osType;
        this.sshPublicKey = sshPublicKey;
        this.version = version;
    }

    /**
     * Specifies the host OS name of the HANA instance.
     * 
    */
    public Optional<String> getComputerName() {
        return Optional.ofNullable(this.computerName);
    }
    /**
     * This property allows you to specify the type of the OS.
     * 
    */
    public String getOsType() {
        return this.osType;
    }
    /**
     * Specifies the SSH public key used to access the operating system.
     * 
    */
    public Optional<String> getSshPublicKey() {
        return Optional.ofNullable(this.sshPublicKey);
    }
    /**
     * Specifies version of operating system.
     * 
    */
    public String getVersion() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String computerName;
        private String osType;
        private @Nullable String sshPublicKey;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(OSProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.computerName = defaults.computerName;
    	      this.osType = defaults.osType;
    	      this.sshPublicKey = defaults.sshPublicKey;
    	      this.version = defaults.version;
        }

        public Builder computerName(@Nullable String computerName) {
            this.computerName = computerName;
            return this;
        }

        public Builder osType(String osType) {
            this.osType = Objects.requireNonNull(osType);
            return this;
        }

        public Builder sshPublicKey(@Nullable String sshPublicKey) {
            this.sshPublicKey = sshPublicKey;
            return this;
        }

        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public OSProfileResponse build() {
            return new OSProfileResponse(computerName, osType, sshPublicKey, version);
        }
    }
}
