// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class EventConnectionAuthParametersBasicGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final EventConnectionAuthParametersBasicGetArgs Empty = new EventConnectionAuthParametersBasicGetArgs();

    /**
     * A password for the authorization. Created and stored in AWS Secrets Manager.
     * 
     */
    @InputImport(name="password", required=true)
    private final Input<String> password;

    public Input<String> getPassword() {
        return this.password;
    }

    /**
     * A username for the authorization.
     * 
     */
    @InputImport(name="username", required=true)
    private final Input<String> username;

    public Input<String> getUsername() {
        return this.username;
    }

    public EventConnectionAuthParametersBasicGetArgs(
        Input<String> password,
        Input<String> username) {
        this.password = Objects.requireNonNull(password, "expected parameter 'password' to be non-null");
        this.username = Objects.requireNonNull(username, "expected parameter 'username' to be non-null");
    }

    private EventConnectionAuthParametersBasicGetArgs() {
        this.password = Input.empty();
        this.username = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventConnectionAuthParametersBasicGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> password;
        private Input<String> username;

        public Builder() {
    	      // Empty
        }

        public Builder(EventConnectionAuthParametersBasicGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.username = defaults.username;
        }

        public Builder setPassword(Input<String> password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }

        public Builder setPassword(String password) {
            this.password = Input.of(Objects.requireNonNull(password));
            return this;
        }

        public Builder setUsername(Input<String> username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }

        public Builder setUsername(String username) {
            this.username = Input.of(Objects.requireNonNull(username));
            return this;
        }
        public EventConnectionAuthParametersBasicGetArgs build() {
            return new EventConnectionAuthParametersBasicGetArgs(password, username);
        }
    }
}
