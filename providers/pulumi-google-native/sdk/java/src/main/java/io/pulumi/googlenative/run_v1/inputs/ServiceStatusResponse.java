// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.run_v1.inputs.AddressableResponse;
import io.pulumi.googlenative.run_v1.inputs.GoogleCloudRunV1ConditionResponse;
import io.pulumi.googlenative.run_v1.inputs.TrafficTargetResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * The current state of the Service. Output only.
 * 
 */
public final class ServiceStatusResponse extends io.pulumi.resources.InvokeArgs {

    public static final ServiceStatusResponse Empty = new ServiceStatusResponse();

    /**
     * From RouteStatus. Similar to url, information on where the service is available on HTTP.
     * 
     */
    @Import(name="address", required=true)
      private final AddressableResponse address;

    public AddressableResponse getAddress() {
        return this.address;
    }

    /**
     * Conditions communicates information about ongoing/complete reconciliation processes that bring the "spec" inline with the observed state of the world. Service-specific conditions include: * "ConfigurationsReady": true when the underlying Configuration is ready. * "RoutesReady": true when the underlying Route is ready. * "Ready": true when both the underlying Route and Configuration are ready.
     * 
     */
    @Import(name="conditions", required=true)
      private final List<GoogleCloudRunV1ConditionResponse> conditions;

    public List<GoogleCloudRunV1ConditionResponse> getConditions() {
        return this.conditions;
    }

    /**
     * From ConfigurationStatus. LatestCreatedRevisionName is the last revision that was created from this Service's Configuration. It might not be ready yet, for that use LatestReadyRevisionName.
     * 
     */
    @Import(name="latestCreatedRevisionName", required=true)
      private final String latestCreatedRevisionName;

    public String getLatestCreatedRevisionName() {
        return this.latestCreatedRevisionName;
    }

    /**
     * From ConfigurationStatus. LatestReadyRevisionName holds the name of the latest Revision stamped out from this Service's Configuration that has had its "Ready" condition become "True".
     * 
     */
    @Import(name="latestReadyRevisionName", required=true)
      private final String latestReadyRevisionName;

    public String getLatestReadyRevisionName() {
        return this.latestReadyRevisionName;
    }

    /**
     * ObservedGeneration is the 'Generation' of the Route that was last processed by the controller. Clients polling for completed reconciliation should poll until observedGeneration = metadata.generation and the Ready condition's status is True or False.
     * 
     */
    @Import(name="observedGeneration", required=true)
      private final Integer observedGeneration;

    public Integer getObservedGeneration() {
        return this.observedGeneration;
    }

    /**
     * From RouteStatus. Traffic holds the configured traffic distribution. These entries will always contain RevisionName references. When ConfigurationName appears in the spec, this will hold the LatestReadyRevisionName that we last observed.
     * 
     */
    @Import(name="traffic", required=true)
      private final List<TrafficTargetResponse> traffic;

    public List<TrafficTargetResponse> getTraffic() {
        return this.traffic;
    }

    /**
     * From RouteStatus. URL holds the url that will distribute traffic over the provided traffic targets. It generally has the form https://{route-hash}-{project-hash}-{cluster-level-suffix}.a.run.app
     * 
     */
    @Import(name="url", required=true)
      private final String url;

    public String getUrl() {
        return this.url;
    }

    public ServiceStatusResponse(
        AddressableResponse address,
        List<GoogleCloudRunV1ConditionResponse> conditions,
        String latestCreatedRevisionName,
        String latestReadyRevisionName,
        Integer observedGeneration,
        List<TrafficTargetResponse> traffic,
        String url) {
        this.address = Objects.requireNonNull(address, "expected parameter 'address' to be non-null");
        this.conditions = Objects.requireNonNull(conditions, "expected parameter 'conditions' to be non-null");
        this.latestCreatedRevisionName = Objects.requireNonNull(latestCreatedRevisionName, "expected parameter 'latestCreatedRevisionName' to be non-null");
        this.latestReadyRevisionName = Objects.requireNonNull(latestReadyRevisionName, "expected parameter 'latestReadyRevisionName' to be non-null");
        this.observedGeneration = Objects.requireNonNull(observedGeneration, "expected parameter 'observedGeneration' to be non-null");
        this.traffic = Objects.requireNonNull(traffic, "expected parameter 'traffic' to be non-null");
        this.url = Objects.requireNonNull(url, "expected parameter 'url' to be non-null");
    }

    private ServiceStatusResponse() {
        this.address = null;
        this.conditions = List.of();
        this.latestCreatedRevisionName = null;
        this.latestReadyRevisionName = null;
        this.observedGeneration = null;
        this.traffic = List.of();
        this.url = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AddressableResponse address;
        private List<GoogleCloudRunV1ConditionResponse> conditions;
        private String latestCreatedRevisionName;
        private String latestReadyRevisionName;
        private Integer observedGeneration;
        private List<TrafficTargetResponse> traffic;
        private String url;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.conditions = defaults.conditions;
    	      this.latestCreatedRevisionName = defaults.latestCreatedRevisionName;
    	      this.latestReadyRevisionName = defaults.latestReadyRevisionName;
    	      this.observedGeneration = defaults.observedGeneration;
    	      this.traffic = defaults.traffic;
    	      this.url = defaults.url;
        }

        public Builder address(AddressableResponse address) {
            this.address = Objects.requireNonNull(address);
            return this;
        }

        public Builder conditions(List<GoogleCloudRunV1ConditionResponse> conditions) {
            this.conditions = Objects.requireNonNull(conditions);
            return this;
        }

        public Builder latestCreatedRevisionName(String latestCreatedRevisionName) {
            this.latestCreatedRevisionName = Objects.requireNonNull(latestCreatedRevisionName);
            return this;
        }

        public Builder latestReadyRevisionName(String latestReadyRevisionName) {
            this.latestReadyRevisionName = Objects.requireNonNull(latestReadyRevisionName);
            return this;
        }

        public Builder observedGeneration(Integer observedGeneration) {
            this.observedGeneration = Objects.requireNonNull(observedGeneration);
            return this;
        }

        public Builder traffic(List<TrafficTargetResponse> traffic) {
            this.traffic = Objects.requireNonNull(traffic);
            return this;
        }

        public Builder url(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }
        public ServiceStatusResponse build() {
            return new ServiceStatusResponse(address, conditions, latestCreatedRevisionName, latestReadyRevisionName, observedGeneration, traffic, url);
        }
    }
}
