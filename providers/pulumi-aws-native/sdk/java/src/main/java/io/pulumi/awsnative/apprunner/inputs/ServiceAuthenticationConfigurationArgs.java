// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apprunner.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Authentication Configuration
 * 
 */
public final class ServiceAuthenticationConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceAuthenticationConfigurationArgs Empty = new ServiceAuthenticationConfigurationArgs();

    /**
     * Access Role Arn
     * 
     */
    @InputImport(name="accessRoleArn")
        private final @Nullable Input<String> accessRoleArn;

    public Input<String> getAccessRoleArn() {
        return this.accessRoleArn == null ? Input.empty() : this.accessRoleArn;
    }

    /**
     * Connection Arn
     * 
     */
    @InputImport(name="connectionArn")
        private final @Nullable Input<String> connectionArn;

    public Input<String> getConnectionArn() {
        return this.connectionArn == null ? Input.empty() : this.connectionArn;
    }

    public ServiceAuthenticationConfigurationArgs(
        @Nullable Input<String> accessRoleArn,
        @Nullable Input<String> connectionArn) {
        this.accessRoleArn = accessRoleArn;
        this.connectionArn = connectionArn;
    }

    private ServiceAuthenticationConfigurationArgs() {
        this.accessRoleArn = Input.empty();
        this.connectionArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceAuthenticationConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> accessRoleArn;
        private @Nullable Input<String> connectionArn;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceAuthenticationConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessRoleArn = defaults.accessRoleArn;
    	      this.connectionArn = defaults.connectionArn;
        }

        public Builder setAccessRoleArn(@Nullable Input<String> accessRoleArn) {
            this.accessRoleArn = accessRoleArn;
            return this;
        }

        public Builder setAccessRoleArn(@Nullable String accessRoleArn) {
            this.accessRoleArn = Input.ofNullable(accessRoleArn);
            return this;
        }

        public Builder setConnectionArn(@Nullable Input<String> connectionArn) {
            this.connectionArn = connectionArn;
            return this;
        }

        public Builder setConnectionArn(@Nullable String connectionArn) {
            this.connectionArn = Input.ofNullable(connectionArn);
            return this;
        }
        public ServiceAuthenticationConfigurationArgs build() {
            return new ServiceAuthenticationConfigurationArgs(accessRoleArn, connectionArn);
        }
    }
}
