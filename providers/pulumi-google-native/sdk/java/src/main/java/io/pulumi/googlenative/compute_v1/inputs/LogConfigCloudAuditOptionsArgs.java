// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.compute_v1.enums.LogConfigCloudAuditOptionsLogName;
import io.pulumi.googlenative.compute_v1.inputs.AuthorizationLoggingOptionsArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LogConfigCloudAuditOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final LogConfigCloudAuditOptionsArgs Empty = new LogConfigCloudAuditOptionsArgs();

    @InputImport(name="authorizationLoggingOptions")
    private final @Nullable Input<AuthorizationLoggingOptionsArgs> authorizationLoggingOptions;

    public Input<AuthorizationLoggingOptionsArgs> getAuthorizationLoggingOptions() {
        return this.authorizationLoggingOptions == null ? Input.empty() : this.authorizationLoggingOptions;
    }

    @InputImport(name="logName")
    private final @Nullable Input<LogConfigCloudAuditOptionsLogName> logName;

    public Input<LogConfigCloudAuditOptionsLogName> getLogName() {
        return this.logName == null ? Input.empty() : this.logName;
    }

    public LogConfigCloudAuditOptionsArgs(
        @Nullable Input<AuthorizationLoggingOptionsArgs> authorizationLoggingOptions,
        @Nullable Input<LogConfigCloudAuditOptionsLogName> logName) {
        this.authorizationLoggingOptions = authorizationLoggingOptions;
        this.logName = logName;
    }

    private LogConfigCloudAuditOptionsArgs() {
        this.authorizationLoggingOptions = Input.empty();
        this.logName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogConfigCloudAuditOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<AuthorizationLoggingOptionsArgs> authorizationLoggingOptions;
        private @Nullable Input<LogConfigCloudAuditOptionsLogName> logName;

        public Builder() {
    	      // Empty
        }

        public Builder(LogConfigCloudAuditOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationLoggingOptions = defaults.authorizationLoggingOptions;
    	      this.logName = defaults.logName;
        }

        public Builder setAuthorizationLoggingOptions(@Nullable Input<AuthorizationLoggingOptionsArgs> authorizationLoggingOptions) {
            this.authorizationLoggingOptions = authorizationLoggingOptions;
            return this;
        }

        public Builder setAuthorizationLoggingOptions(@Nullable AuthorizationLoggingOptionsArgs authorizationLoggingOptions) {
            this.authorizationLoggingOptions = Input.ofNullable(authorizationLoggingOptions);
            return this;
        }

        public Builder setLogName(@Nullable Input<LogConfigCloudAuditOptionsLogName> logName) {
            this.logName = logName;
            return this;
        }

        public Builder setLogName(@Nullable LogConfigCloudAuditOptionsLogName logName) {
            this.logName = Input.ofNullable(logName);
            return this;
        }

        public LogConfigCloudAuditOptionsArgs build() {
            return new LogConfigCloudAuditOptionsArgs(authorizationLoggingOptions, logName);
        }
    }
}