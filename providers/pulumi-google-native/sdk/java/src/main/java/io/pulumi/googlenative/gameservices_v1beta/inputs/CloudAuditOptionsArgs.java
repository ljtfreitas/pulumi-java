// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gameservices_v1beta.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.gameservices_v1beta.enums.CloudAuditOptionsLogName;
import io.pulumi.googlenative.gameservices_v1beta.inputs.AuthorizationLoggingOptionsArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Write a Cloud Audit log
 * 
 */
public final class CloudAuditOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final CloudAuditOptionsArgs Empty = new CloudAuditOptionsArgs();

    /**
     * Information used by the Cloud Audit Logging pipeline.
     * 
     */
    @InputImport(name="authorizationLoggingOptions")
      private final @Nullable Input<AuthorizationLoggingOptionsArgs> authorizationLoggingOptions;

    public Input<AuthorizationLoggingOptionsArgs> getAuthorizationLoggingOptions() {
        return this.authorizationLoggingOptions == null ? Input.empty() : this.authorizationLoggingOptions;
    }

    /**
     * The log_name to populate in the Cloud Audit Record.
     * 
     */
    @InputImport(name="logName")
      private final @Nullable Input<CloudAuditOptionsLogName> logName;

    public Input<CloudAuditOptionsLogName> getLogName() {
        return this.logName == null ? Input.empty() : this.logName;
    }

    public CloudAuditOptionsArgs(
        @Nullable Input<AuthorizationLoggingOptionsArgs> authorizationLoggingOptions,
        @Nullable Input<CloudAuditOptionsLogName> logName) {
        this.authorizationLoggingOptions = authorizationLoggingOptions;
        this.logName = logName;
    }

    private CloudAuditOptionsArgs() {
        this.authorizationLoggingOptions = Input.empty();
        this.logName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudAuditOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<AuthorizationLoggingOptionsArgs> authorizationLoggingOptions;
        private @Nullable Input<CloudAuditOptionsLogName> logName;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudAuditOptionsArgs defaults) {
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

        public Builder setLogName(@Nullable Input<CloudAuditOptionsLogName> logName) {
            this.logName = logName;
            return this;
        }

        public Builder setLogName(@Nullable CloudAuditOptionsLogName logName) {
            this.logName = Input.ofNullable(logName);
            return this;
        }
        public CloudAuditOptionsArgs build() {
            return new CloudAuditOptionsArgs(authorizationLoggingOptions, logName);
        }
    }
}
