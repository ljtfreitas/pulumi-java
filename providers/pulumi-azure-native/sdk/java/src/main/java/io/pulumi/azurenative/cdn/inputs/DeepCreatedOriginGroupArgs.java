// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.azurenative.cdn.inputs.HealthProbeParametersArgs;
import io.pulumi.azurenative.cdn.inputs.ResourceReferenceArgs;
import io.pulumi.azurenative.cdn.inputs.ResponseBasedOriginErrorDetectionParametersArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The origin group for CDN content which is added when creating a CDN endpoint. Traffic is sent to the origins within the origin group based on origin health.
 * 
 */
public final class DeepCreatedOriginGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeepCreatedOriginGroupArgs Empty = new DeepCreatedOriginGroupArgs();

    /**
     * Health probe settings to the origin that is used to determine the health of the origin.
     * 
     */
    @InputImport(name="healthProbeSettings")
        private final @Nullable Input<HealthProbeParametersArgs> healthProbeSettings;

    public Input<HealthProbeParametersArgs> getHealthProbeSettings() {
        return this.healthProbeSettings == null ? Input.empty() : this.healthProbeSettings;
    }

    /**
     * Origin group name which must be unique within the endpoint.
     * 
     */
    @InputImport(name="name", required=true)
        private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * The source of the content being delivered via CDN within given origin group.
     * 
     */
    @InputImport(name="origins", required=true)
        private final Input<List<ResourceReferenceArgs>> origins;

    public Input<List<ResourceReferenceArgs>> getOrigins() {
        return this.origins;
    }

    /**
     * The JSON object that contains the properties to determine origin health using real requests/responses.This property is currently not supported.
     * 
     */
    @InputImport(name="responseBasedOriginErrorDetectionSettings")
        private final @Nullable Input<ResponseBasedOriginErrorDetectionParametersArgs> responseBasedOriginErrorDetectionSettings;

    public Input<ResponseBasedOriginErrorDetectionParametersArgs> getResponseBasedOriginErrorDetectionSettings() {
        return this.responseBasedOriginErrorDetectionSettings == null ? Input.empty() : this.responseBasedOriginErrorDetectionSettings;
    }

    /**
     * Time in minutes to shift the traffic to the endpoint gradually when an unhealthy endpoint comes healthy or a new endpoint is added. Default is 10 mins. This property is currently not supported.
     * 
     */
    @InputImport(name="trafficRestorationTimeToHealedOrNewEndpointsInMinutes")
        private final @Nullable Input<Integer> trafficRestorationTimeToHealedOrNewEndpointsInMinutes;

    public Input<Integer> getTrafficRestorationTimeToHealedOrNewEndpointsInMinutes() {
        return this.trafficRestorationTimeToHealedOrNewEndpointsInMinutes == null ? Input.empty() : this.trafficRestorationTimeToHealedOrNewEndpointsInMinutes;
    }

    public DeepCreatedOriginGroupArgs(
        @Nullable Input<HealthProbeParametersArgs> healthProbeSettings,
        Input<String> name,
        Input<List<ResourceReferenceArgs>> origins,
        @Nullable Input<ResponseBasedOriginErrorDetectionParametersArgs> responseBasedOriginErrorDetectionSettings,
        @Nullable Input<Integer> trafficRestorationTimeToHealedOrNewEndpointsInMinutes) {
        this.healthProbeSettings = healthProbeSettings;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.origins = Objects.requireNonNull(origins, "expected parameter 'origins' to be non-null");
        this.responseBasedOriginErrorDetectionSettings = responseBasedOriginErrorDetectionSettings;
        this.trafficRestorationTimeToHealedOrNewEndpointsInMinutes = trafficRestorationTimeToHealedOrNewEndpointsInMinutes;
    }

    private DeepCreatedOriginGroupArgs() {
        this.healthProbeSettings = Input.empty();
        this.name = Input.empty();
        this.origins = Input.empty();
        this.responseBasedOriginErrorDetectionSettings = Input.empty();
        this.trafficRestorationTimeToHealedOrNewEndpointsInMinutes = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeepCreatedOriginGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<HealthProbeParametersArgs> healthProbeSettings;
        private Input<String> name;
        private Input<List<ResourceReferenceArgs>> origins;
        private @Nullable Input<ResponseBasedOriginErrorDetectionParametersArgs> responseBasedOriginErrorDetectionSettings;
        private @Nullable Input<Integer> trafficRestorationTimeToHealedOrNewEndpointsInMinutes;

        public Builder() {
    	      // Empty
        }

        public Builder(DeepCreatedOriginGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.healthProbeSettings = defaults.healthProbeSettings;
    	      this.name = defaults.name;
    	      this.origins = defaults.origins;
    	      this.responseBasedOriginErrorDetectionSettings = defaults.responseBasedOriginErrorDetectionSettings;
    	      this.trafficRestorationTimeToHealedOrNewEndpointsInMinutes = defaults.trafficRestorationTimeToHealedOrNewEndpointsInMinutes;
        }

        public Builder setHealthProbeSettings(@Nullable Input<HealthProbeParametersArgs> healthProbeSettings) {
            this.healthProbeSettings = healthProbeSettings;
            return this;
        }

        public Builder setHealthProbeSettings(@Nullable HealthProbeParametersArgs healthProbeSettings) {
            this.healthProbeSettings = Input.ofNullable(healthProbeSettings);
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

        public Builder setOrigins(Input<List<ResourceReferenceArgs>> origins) {
            this.origins = Objects.requireNonNull(origins);
            return this;
        }

        public Builder setOrigins(List<ResourceReferenceArgs> origins) {
            this.origins = Input.of(Objects.requireNonNull(origins));
            return this;
        }

        public Builder setResponseBasedOriginErrorDetectionSettings(@Nullable Input<ResponseBasedOriginErrorDetectionParametersArgs> responseBasedOriginErrorDetectionSettings) {
            this.responseBasedOriginErrorDetectionSettings = responseBasedOriginErrorDetectionSettings;
            return this;
        }

        public Builder setResponseBasedOriginErrorDetectionSettings(@Nullable ResponseBasedOriginErrorDetectionParametersArgs responseBasedOriginErrorDetectionSettings) {
            this.responseBasedOriginErrorDetectionSettings = Input.ofNullable(responseBasedOriginErrorDetectionSettings);
            return this;
        }

        public Builder setTrafficRestorationTimeToHealedOrNewEndpointsInMinutes(@Nullable Input<Integer> trafficRestorationTimeToHealedOrNewEndpointsInMinutes) {
            this.trafficRestorationTimeToHealedOrNewEndpointsInMinutes = trafficRestorationTimeToHealedOrNewEndpointsInMinutes;
            return this;
        }

        public Builder setTrafficRestorationTimeToHealedOrNewEndpointsInMinutes(@Nullable Integer trafficRestorationTimeToHealedOrNewEndpointsInMinutes) {
            this.trafficRestorationTimeToHealedOrNewEndpointsInMinutes = Input.ofNullable(trafficRestorationTimeToHealedOrNewEndpointsInMinutes);
            return this;
        }
        public DeepCreatedOriginGroupArgs build() {
            return new DeepCreatedOriginGroupArgs(healthProbeSettings, name, origins, responseBasedOriginErrorDetectionSettings, trafficRestorationTimeToHealedOrNewEndpointsInMinutes);
        }
    }
}
