// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1FulfillmentFeatureArgs;
import io.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1FulfillmentGenericWebServiceArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * By default, your agent responds to a matched intent with a static response. As an alternative, you can provide a more dynamic response by using fulfillment. When you enable fulfillment for an intent, Dialogflow responds to that intent by calling a service that you define. For example, if an end-user wants to schedule a haircut on Friday, your service can check your database and respond to the end-user with availability information for Friday. For more information, see the [fulfillment guide](https://cloud.google.com/dialogflow/docs/fulfillment-overview).
 * 
 */
public final class GoogleCloudDialogflowV2beta1FulfillmentArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2beta1FulfillmentArgs Empty = new GoogleCloudDialogflowV2beta1FulfillmentArgs();

    /**
     * The human-readable name of the fulfillment, unique within the agent. This field is not used for Fulfillment in an Environment.
     * 
     */
    @InputImport(name="displayName")
      private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * Whether fulfillment is enabled.
     * 
     */
    @InputImport(name="enabled")
      private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    /**
     * The field defines whether the fulfillment is enabled for certain features.
     * 
     */
    @InputImport(name="features")
      private final @Nullable Input<List<GoogleCloudDialogflowV2beta1FulfillmentFeatureArgs>> features;

    public Input<List<GoogleCloudDialogflowV2beta1FulfillmentFeatureArgs>> getFeatures() {
        return this.features == null ? Input.empty() : this.features;
    }

    /**
     * Configuration for a generic web service.
     * 
     */
    @InputImport(name="genericWebService")
      private final @Nullable Input<GoogleCloudDialogflowV2beta1FulfillmentGenericWebServiceArgs> genericWebService;

    public Input<GoogleCloudDialogflowV2beta1FulfillmentGenericWebServiceArgs> getGenericWebService() {
        return this.genericWebService == null ? Input.empty() : this.genericWebService;
    }

    /**
     * The unique identifier of the fulfillment. Supported formats: - `projects//agent/fulfillment` - `projects//locations//agent/fulfillment` This field is not used for Fulfillment in an Environment.
     * 
     */
    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    public GoogleCloudDialogflowV2beta1FulfillmentArgs(
        @Nullable Input<String> displayName,
        @Nullable Input<Boolean> enabled,
        @Nullable Input<List<GoogleCloudDialogflowV2beta1FulfillmentFeatureArgs>> features,
        @Nullable Input<GoogleCloudDialogflowV2beta1FulfillmentGenericWebServiceArgs> genericWebService,
        Input<String> name) {
        this.displayName = displayName;
        this.enabled = enabled;
        this.features = features;
        this.genericWebService = genericWebService;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private GoogleCloudDialogflowV2beta1FulfillmentArgs() {
        this.displayName = Input.empty();
        this.enabled = Input.empty();
        this.features = Input.empty();
        this.genericWebService = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1FulfillmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> displayName;
        private @Nullable Input<Boolean> enabled;
        private @Nullable Input<List<GoogleCloudDialogflowV2beta1FulfillmentFeatureArgs>> features;
        private @Nullable Input<GoogleCloudDialogflowV2beta1FulfillmentGenericWebServiceArgs> genericWebService;
        private Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1FulfillmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.enabled = defaults.enabled;
    	      this.features = defaults.features;
    	      this.genericWebService = defaults.genericWebService;
    	      this.name = defaults.name;
        }

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder setEnabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }

        public Builder setFeatures(@Nullable Input<List<GoogleCloudDialogflowV2beta1FulfillmentFeatureArgs>> features) {
            this.features = features;
            return this;
        }

        public Builder setFeatures(@Nullable List<GoogleCloudDialogflowV2beta1FulfillmentFeatureArgs> features) {
            this.features = Input.ofNullable(features);
            return this;
        }

        public Builder setGenericWebService(@Nullable Input<GoogleCloudDialogflowV2beta1FulfillmentGenericWebServiceArgs> genericWebService) {
            this.genericWebService = genericWebService;
            return this;
        }

        public Builder setGenericWebService(@Nullable GoogleCloudDialogflowV2beta1FulfillmentGenericWebServiceArgs genericWebService) {
            this.genericWebService = Input.ofNullable(genericWebService);
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }
        public GoogleCloudDialogflowV2beta1FulfillmentArgs build() {
            return new GoogleCloudDialogflowV2beta1FulfillmentArgs(displayName, enabled, features, genericWebService, name);
        }
    }
}
