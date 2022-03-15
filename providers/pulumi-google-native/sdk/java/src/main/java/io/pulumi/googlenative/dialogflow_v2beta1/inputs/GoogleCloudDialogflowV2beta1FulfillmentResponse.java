// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1FulfillmentFeatureResponse;
import io.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1FulfillmentGenericWebServiceResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * By default, your agent responds to a matched intent with a static response. As an alternative, you can provide a more dynamic response by using fulfillment. When you enable fulfillment for an intent, Dialogflow responds to that intent by calling a service that you define. For example, if an end-user wants to schedule a haircut on Friday, your service can check your database and respond to the end-user with availability information for Friday. For more information, see the [fulfillment guide](https://cloud.google.com/dialogflow/docs/fulfillment-overview).
 * 
 */
public final class GoogleCloudDialogflowV2beta1FulfillmentResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowV2beta1FulfillmentResponse Empty = new GoogleCloudDialogflowV2beta1FulfillmentResponse();

    /**
     * The human-readable name of the fulfillment, unique within the agent. This field is not used for Fulfillment in an Environment.
     * 
     */
    @Import(name="displayName", required=true)
      private final String displayName;

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * Whether fulfillment is enabled.
     * 
     */
    @Import(name="enabled", required=true)
      private final Boolean enabled;

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * The field defines whether the fulfillment is enabled for certain features.
     * 
     */
    @Import(name="features", required=true)
      private final List<GoogleCloudDialogflowV2beta1FulfillmentFeatureResponse> features;

    public List<GoogleCloudDialogflowV2beta1FulfillmentFeatureResponse> getFeatures() {
        return this.features;
    }

    /**
     * Configuration for a generic web service.
     * 
     */
    @Import(name="genericWebService", required=true)
      private final GoogleCloudDialogflowV2beta1FulfillmentGenericWebServiceResponse genericWebService;

    public GoogleCloudDialogflowV2beta1FulfillmentGenericWebServiceResponse getGenericWebService() {
        return this.genericWebService;
    }

    /**
     * The unique identifier of the fulfillment. Supported formats: - `projects//agent/fulfillment` - `projects//locations//agent/fulfillment` This field is not used for Fulfillment in an Environment.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    public GoogleCloudDialogflowV2beta1FulfillmentResponse(
        String displayName,
        Boolean enabled,
        List<GoogleCloudDialogflowV2beta1FulfillmentFeatureResponse> features,
        GoogleCloudDialogflowV2beta1FulfillmentGenericWebServiceResponse genericWebService,
        String name) {
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
        this.features = Objects.requireNonNull(features, "expected parameter 'features' to be non-null");
        this.genericWebService = Objects.requireNonNull(genericWebService, "expected parameter 'genericWebService' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private GoogleCloudDialogflowV2beta1FulfillmentResponse() {
        this.displayName = null;
        this.enabled = null;
        this.features = List.of();
        this.genericWebService = null;
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1FulfillmentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String displayName;
        private Boolean enabled;
        private List<GoogleCloudDialogflowV2beta1FulfillmentFeatureResponse> features;
        private GoogleCloudDialogflowV2beta1FulfillmentGenericWebServiceResponse genericWebService;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1FulfillmentResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.enabled = defaults.enabled;
    	      this.features = defaults.features;
    	      this.genericWebService = defaults.genericWebService;
    	      this.name = defaults.name;
        }

        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder features(List<GoogleCloudDialogflowV2beta1FulfillmentFeatureResponse> features) {
            this.features = Objects.requireNonNull(features);
            return this;
        }

        public Builder genericWebService(GoogleCloudDialogflowV2beta1FulfillmentGenericWebServiceResponse genericWebService) {
            this.genericWebService = Objects.requireNonNull(genericWebService);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public GoogleCloudDialogflowV2beta1FulfillmentResponse build() {
            return new GoogleCloudDialogflowV2beta1FulfillmentResponse(displayName, enabled, features, genericWebService, name);
        }
    }
}
