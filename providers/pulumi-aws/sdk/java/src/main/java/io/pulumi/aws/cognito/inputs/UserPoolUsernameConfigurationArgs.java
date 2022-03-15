// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cognito.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


public final class UserPoolUsernameConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserPoolUsernameConfigurationArgs Empty = new UserPoolUsernameConfigurationArgs();

    /**
     * Whether username case sensitivity will be applied for all users in the user pool through Cognito APIs.
     * 
     */
    @Import(name="caseSensitive", required=true)
      private final Output<Boolean> caseSensitive;

    public Output<Boolean> getCaseSensitive() {
        return this.caseSensitive;
    }

    public UserPoolUsernameConfigurationArgs(Output<Boolean> caseSensitive) {
        this.caseSensitive = Objects.requireNonNull(caseSensitive, "expected parameter 'caseSensitive' to be non-null");
    }

    private UserPoolUsernameConfigurationArgs() {
        this.caseSensitive = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserPoolUsernameConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Boolean> caseSensitive;

        public Builder() {
    	      // Empty
        }

        public Builder(UserPoolUsernameConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caseSensitive = defaults.caseSensitive;
        }

        public Builder caseSensitive(Output<Boolean> caseSensitive) {
            this.caseSensitive = Objects.requireNonNull(caseSensitive);
            return this;
        }

        public Builder caseSensitive(Boolean caseSensitive) {
            this.caseSensitive = Output.of(Objects.requireNonNull(caseSensitive));
            return this;
        }
        public UserPoolUsernameConfigurationArgs build() {
            return new UserPoolUsernameConfigurationArgs(caseSensitive);
        }
    }
}
