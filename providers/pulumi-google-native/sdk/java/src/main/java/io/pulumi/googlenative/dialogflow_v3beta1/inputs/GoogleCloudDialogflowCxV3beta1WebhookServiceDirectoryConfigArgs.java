// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1WebhookGenericWebServiceArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents configuration for a [Service Directory](https://cloud.google.com/service-directory) service.
 * 
 */
public final class GoogleCloudDialogflowCxV3beta1WebhookServiceDirectoryConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3beta1WebhookServiceDirectoryConfigArgs Empty = new GoogleCloudDialogflowCxV3beta1WebhookServiceDirectoryConfigArgs();

    /**
     * Generic Service configuration of this webhook.
     * 
     */
    @Import(name="genericWebService")
      private final @Nullable Output<GoogleCloudDialogflowCxV3beta1WebhookGenericWebServiceArgs> genericWebService;

    public Output<GoogleCloudDialogflowCxV3beta1WebhookGenericWebServiceArgs> getGenericWebService() {
        return this.genericWebService == null ? Output.empty() : this.genericWebService;
    }

    /**
     * The name of [Service Directory](https://cloud.google.com/service-directory) service. Format: `projects//locations//namespaces//services/`. `Location ID` of the service directory must be the same as the location of the agent.
     * 
     */
    @Import(name="service", required=true)
      private final Output<String> service;

    public Output<String> getService() {
        return this.service;
    }

    public GoogleCloudDialogflowCxV3beta1WebhookServiceDirectoryConfigArgs(
        @Nullable Output<GoogleCloudDialogflowCxV3beta1WebhookGenericWebServiceArgs> genericWebService,
        Output<String> service) {
        this.genericWebService = genericWebService;
        this.service = Objects.requireNonNull(service, "expected parameter 'service' to be non-null");
    }

    private GoogleCloudDialogflowCxV3beta1WebhookServiceDirectoryConfigArgs() {
        this.genericWebService = Output.empty();
        this.service = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1WebhookServiceDirectoryConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<GoogleCloudDialogflowCxV3beta1WebhookGenericWebServiceArgs> genericWebService;
        private Output<String> service;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1WebhookServiceDirectoryConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.genericWebService = defaults.genericWebService;
    	      this.service = defaults.service;
        }

        public Builder genericWebService(@Nullable Output<GoogleCloudDialogflowCxV3beta1WebhookGenericWebServiceArgs> genericWebService) {
            this.genericWebService = genericWebService;
            return this;
        }

        public Builder genericWebService(@Nullable GoogleCloudDialogflowCxV3beta1WebhookGenericWebServiceArgs genericWebService) {
            this.genericWebService = Output.ofNullable(genericWebService);
            return this;
        }

        public Builder service(Output<String> service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }

        public Builder service(String service) {
            this.service = Output.of(Objects.requireNonNull(service));
            return this;
        }
        public GoogleCloudDialogflowCxV3beta1WebhookServiceDirectoryConfigArgs build() {
            return new GoogleCloudDialogflowCxV3beta1WebhookServiceDirectoryConfigArgs(genericWebService, service);
        }
    }
}
