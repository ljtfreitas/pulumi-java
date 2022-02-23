// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cognito.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;


public final class UserPoolUsernameConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserPoolUsernameConfigurationArgs Empty = new UserPoolUsernameConfigurationArgs();

    /**
     * Whether username case sensitivity will be applied for all users in the user pool through Cognito APIs.
     * 
     */
    @InputImport(name="caseSensitive", required=true)
    private final Input<Boolean> caseSensitive;

    public Input<Boolean> getCaseSensitive() {
        return this.caseSensitive;
    }

    public UserPoolUsernameConfigurationArgs(Input<Boolean> caseSensitive) {
        this.caseSensitive = Objects.requireNonNull(caseSensitive, "expected parameter 'caseSensitive' to be non-null");
    }

    private UserPoolUsernameConfigurationArgs() {
        this.caseSensitive = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserPoolUsernameConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Boolean> caseSensitive;

        public Builder() {
    	      // Empty
        }

        public Builder(UserPoolUsernameConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caseSensitive = defaults.caseSensitive;
        }

        public Builder setCaseSensitive(Input<Boolean> caseSensitive) {
            this.caseSensitive = Objects.requireNonNull(caseSensitive);
            return this;
        }

        public Builder setCaseSensitive(Boolean caseSensitive) {
            this.caseSensitive = Input.of(Objects.requireNonNull(caseSensitive));
            return this;
        }
        public UserPoolUsernameConfigurationArgs build() {
            return new UserPoolUsernameConfigurationArgs(caseSensitive);
        }
    }
}
