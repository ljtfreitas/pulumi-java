// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cognito.outputs;

import io.pulumi.aws.cognito.outputs.UserPoolAccountRecoverySettingRecoveryMechanism;
import io.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class UserPoolAccountRecoverySetting {
    /**
     * List of Account Recovery Options of the following structure:
     * 
     */
    private final List<UserPoolAccountRecoverySettingRecoveryMechanism> recoveryMechanisms;

    @CustomType.Constructor
    private UserPoolAccountRecoverySetting(@CustomType.Parameter("recoveryMechanisms") List<UserPoolAccountRecoverySettingRecoveryMechanism> recoveryMechanisms) {
        this.recoveryMechanisms = recoveryMechanisms;
    }

    /**
     * List of Account Recovery Options of the following structure:
     * 
    */
    public List<UserPoolAccountRecoverySettingRecoveryMechanism> getRecoveryMechanisms() {
        return this.recoveryMechanisms;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserPoolAccountRecoverySetting defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<UserPoolAccountRecoverySettingRecoveryMechanism> recoveryMechanisms;

        public Builder() {
    	      // Empty
        }

        public Builder(UserPoolAccountRecoverySetting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.recoveryMechanisms = defaults.recoveryMechanisms;
        }

        public Builder recoveryMechanisms(List<UserPoolAccountRecoverySettingRecoveryMechanism> recoveryMechanisms) {
            this.recoveryMechanisms = Objects.requireNonNull(recoveryMechanisms);
            return this;
        }
        public UserPoolAccountRecoverySetting build() {
            return new UserPoolAccountRecoverySetting(recoveryMechanisms);
        }
    }
}
