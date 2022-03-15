// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.appengine.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FlexibleAppVersionApiConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final FlexibleAppVersionApiConfigArgs Empty = new FlexibleAppVersionApiConfigArgs();

    /**
     * Action to take when users access resources that require authentication.
     * Default value is `AUTH_FAIL_ACTION_REDIRECT`.
     * Possible values are `AUTH_FAIL_ACTION_REDIRECT` and `AUTH_FAIL_ACTION_UNAUTHORIZED`.
     * 
     */
    @Import(name="authFailAction")
      private final @Nullable Output<String> authFailAction;

    public Output<String> getAuthFailAction() {
        return this.authFailAction == null ? Output.empty() : this.authFailAction;
    }

    /**
     * Level of login required to access this resource.
     * Default value is `LOGIN_OPTIONAL`.
     * Possible values are `LOGIN_OPTIONAL`, `LOGIN_ADMIN`, and `LOGIN_REQUIRED`.
     * 
     */
    @Import(name="login")
      private final @Nullable Output<String> login;

    public Output<String> getLogin() {
        return this.login == null ? Output.empty() : this.login;
    }

    /**
     * Path to the script from the application root directory.
     * 
     */
    @Import(name="script", required=true)
      private final Output<String> script;

    public Output<String> getScript() {
        return this.script;
    }

    /**
     * Security (HTTPS) enforcement for this URL.
     * Possible values are `SECURE_DEFAULT`, `SECURE_NEVER`, `SECURE_OPTIONAL`, and `SECURE_ALWAYS`.
     * 
     */
    @Import(name="securityLevel")
      private final @Nullable Output<String> securityLevel;

    public Output<String> getSecurityLevel() {
        return this.securityLevel == null ? Output.empty() : this.securityLevel;
    }

    /**
     * URL to serve the endpoint at.
     * 
     */
    @Import(name="url")
      private final @Nullable Output<String> url;

    public Output<String> getUrl() {
        return this.url == null ? Output.empty() : this.url;
    }

    public FlexibleAppVersionApiConfigArgs(
        @Nullable Output<String> authFailAction,
        @Nullable Output<String> login,
        Output<String> script,
        @Nullable Output<String> securityLevel,
        @Nullable Output<String> url) {
        this.authFailAction = authFailAction;
        this.login = login;
        this.script = Objects.requireNonNull(script, "expected parameter 'script' to be non-null");
        this.securityLevel = securityLevel;
        this.url = url;
    }

    private FlexibleAppVersionApiConfigArgs() {
        this.authFailAction = Output.empty();
        this.login = Output.empty();
        this.script = Output.empty();
        this.securityLevel = Output.empty();
        this.url = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlexibleAppVersionApiConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> authFailAction;
        private @Nullable Output<String> login;
        private Output<String> script;
        private @Nullable Output<String> securityLevel;
        private @Nullable Output<String> url;

        public Builder() {
    	      // Empty
        }

        public Builder(FlexibleAppVersionApiConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authFailAction = defaults.authFailAction;
    	      this.login = defaults.login;
    	      this.script = defaults.script;
    	      this.securityLevel = defaults.securityLevel;
    	      this.url = defaults.url;
        }

        public Builder authFailAction(@Nullable Output<String> authFailAction) {
            this.authFailAction = authFailAction;
            return this;
        }

        public Builder authFailAction(@Nullable String authFailAction) {
            this.authFailAction = Output.ofNullable(authFailAction);
            return this;
        }

        public Builder login(@Nullable Output<String> login) {
            this.login = login;
            return this;
        }

        public Builder login(@Nullable String login) {
            this.login = Output.ofNullable(login);
            return this;
        }

        public Builder script(Output<String> script) {
            this.script = Objects.requireNonNull(script);
            return this;
        }

        public Builder script(String script) {
            this.script = Output.of(Objects.requireNonNull(script));
            return this;
        }

        public Builder securityLevel(@Nullable Output<String> securityLevel) {
            this.securityLevel = securityLevel;
            return this;
        }

        public Builder securityLevel(@Nullable String securityLevel) {
            this.securityLevel = Output.ofNullable(securityLevel);
            return this;
        }

        public Builder url(@Nullable Output<String> url) {
            this.url = url;
            return this;
        }

        public Builder url(@Nullable String url) {
            this.url = Output.ofNullable(url);
            return this;
        }
        public FlexibleAppVersionApiConfigArgs build() {
            return new FlexibleAppVersionApiConfigArgs(authFailAction, login, script, securityLevel, url);
        }
    }
}
