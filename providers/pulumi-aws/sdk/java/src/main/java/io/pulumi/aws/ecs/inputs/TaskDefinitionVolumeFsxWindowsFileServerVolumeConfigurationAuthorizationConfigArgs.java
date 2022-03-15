// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecs.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class TaskDefinitionVolumeFsxWindowsFileServerVolumeConfigurationAuthorizationConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final TaskDefinitionVolumeFsxWindowsFileServerVolumeConfigurationAuthorizationConfigArgs Empty = new TaskDefinitionVolumeFsxWindowsFileServerVolumeConfigurationAuthorizationConfigArgs();

    /**
     * The authorization credential option to use. The authorization credential options can be provided using either the Amazon Resource Name (ARN) of an AWS Secrets Manager secret or AWS Systems Manager Parameter Store parameter. The ARNs refer to the stored credentials.
     * 
     */
    @Import(name="credentialsParameter", required=true)
      private final Output<String> credentialsParameter;

    public Output<String> getCredentialsParameter() {
        return this.credentialsParameter;
    }

    /**
     * A fully qualified domain name hosted by an AWS Directory Service Managed Microsoft AD (Active Directory) or self-hosted AD on Amazon EC2.
     * 
     */
    @Import(name="domain", required=true)
      private final Output<String> domain;

    public Output<String> getDomain() {
        return this.domain;
    }

    public TaskDefinitionVolumeFsxWindowsFileServerVolumeConfigurationAuthorizationConfigArgs(
        Output<String> credentialsParameter,
        Output<String> domain) {
        this.credentialsParameter = Objects.requireNonNull(credentialsParameter, "expected parameter 'credentialsParameter' to be non-null");
        this.domain = Objects.requireNonNull(domain, "expected parameter 'domain' to be non-null");
    }

    private TaskDefinitionVolumeFsxWindowsFileServerVolumeConfigurationAuthorizationConfigArgs() {
        this.credentialsParameter = Output.empty();
        this.domain = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskDefinitionVolumeFsxWindowsFileServerVolumeConfigurationAuthorizationConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> credentialsParameter;
        private Output<String> domain;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskDefinitionVolumeFsxWindowsFileServerVolumeConfigurationAuthorizationConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.credentialsParameter = defaults.credentialsParameter;
    	      this.domain = defaults.domain;
        }

        public Builder credentialsParameter(Output<String> credentialsParameter) {
            this.credentialsParameter = Objects.requireNonNull(credentialsParameter);
            return this;
        }

        public Builder credentialsParameter(String credentialsParameter) {
            this.credentialsParameter = Output.of(Objects.requireNonNull(credentialsParameter));
            return this;
        }

        public Builder domain(Output<String> domain) {
            this.domain = Objects.requireNonNull(domain);
            return this;
        }

        public Builder domain(String domain) {
            this.domain = Output.of(Objects.requireNonNull(domain));
            return this;
        }
        public TaskDefinitionVolumeFsxWindowsFileServerVolumeConfigurationAuthorizationConfigArgs build() {
            return new TaskDefinitionVolumeFsxWindowsFileServerVolumeConfigurationAuthorizationConfigArgs(credentialsParameter, domain);
        }
    }
}
