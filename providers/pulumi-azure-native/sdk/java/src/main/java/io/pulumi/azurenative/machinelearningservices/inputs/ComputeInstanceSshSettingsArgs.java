// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.azurenative.machinelearningservices.enums.SshPublicAccess;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies policy and settings for SSH access.
 * 
 */
public final class ComputeInstanceSshSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ComputeInstanceSshSettingsArgs Empty = new ComputeInstanceSshSettingsArgs();

    /**
     * Specifies the SSH rsa public key file as a string. Use "ssh-keygen -t rsa -b 2048" to generate your SSH key pairs.
     * 
     */
    @InputImport(name="adminPublicKey")
        private final @Nullable Input<String> adminPublicKey;

    public Input<String> getAdminPublicKey() {
        return this.adminPublicKey == null ? Input.empty() : this.adminPublicKey;
    }

    /**
     * State of the public SSH port. Possible values are: Disabled - Indicates that the public ssh port is closed on this instance. Enabled - Indicates that the public ssh port is open and accessible according to the VNet/subnet policy if applicable.
     * 
     */
    @InputImport(name="sshPublicAccess")
        private final @Nullable Input<Either<String,SshPublicAccess>> sshPublicAccess;

    public Input<Either<String,SshPublicAccess>> getSshPublicAccess() {
        return this.sshPublicAccess == null ? Input.empty() : this.sshPublicAccess;
    }

    public ComputeInstanceSshSettingsArgs(
        @Nullable Input<String> adminPublicKey,
        @Nullable Input<Either<String,SshPublicAccess>> sshPublicAccess) {
        this.adminPublicKey = adminPublicKey;
        this.sshPublicAccess = sshPublicAccess == null ? Input.ofLeft("Disabled") : sshPublicAccess;
    }

    private ComputeInstanceSshSettingsArgs() {
        this.adminPublicKey = Input.empty();
        this.sshPublicAccess = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComputeInstanceSshSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> adminPublicKey;
        private @Nullable Input<Either<String,SshPublicAccess>> sshPublicAccess;

        public Builder() {
    	      // Empty
        }

        public Builder(ComputeInstanceSshSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adminPublicKey = defaults.adminPublicKey;
    	      this.sshPublicAccess = defaults.sshPublicAccess;
        }

        public Builder setAdminPublicKey(@Nullable Input<String> adminPublicKey) {
            this.adminPublicKey = adminPublicKey;
            return this;
        }

        public Builder setAdminPublicKey(@Nullable String adminPublicKey) {
            this.adminPublicKey = Input.ofNullable(adminPublicKey);
            return this;
        }

        public Builder setSshPublicAccess(@Nullable Input<Either<String,SshPublicAccess>> sshPublicAccess) {
            this.sshPublicAccess = sshPublicAccess;
            return this;
        }

        public Builder setSshPublicAccess(@Nullable Either<String,SshPublicAccess> sshPublicAccess) {
            this.sshPublicAccess = Input.ofNullable(sshPublicAccess);
            return this;
        }
        public ComputeInstanceSshSettingsArgs build() {
            return new ComputeInstanceSshSettingsArgs(adminPublicKey, sshPublicAccess);
        }
    }
}
