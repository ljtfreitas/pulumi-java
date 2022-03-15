// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.autoscaling_v2.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.kubernetes.autoscaling_v2.outputs.ContainerResourceMetricSource;
import io.pulumi.kubernetes.autoscaling_v2.outputs.ExternalMetricSource;
import io.pulumi.kubernetes.autoscaling_v2.outputs.ObjectMetricSource;
import io.pulumi.kubernetes.autoscaling_v2.outputs.PodsMetricSource;
import io.pulumi.kubernetes.autoscaling_v2.outputs.ResourceMetricSource;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MetricSpec {
    /**
     * containerResource refers to a resource metric (such as those specified in requests and limits) known to Kubernetes describing a single container in each pod of the current scale target (e.g. CPU or memory). Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the "pods" source. This is an alpha feature and can be enabled by the HPAContainerMetrics feature flag.
     * 
     */
    private final @Nullable ContainerResourceMetricSource containerResource;
    /**
     * external refers to a global metric that is not associated with any Kubernetes object. It allows autoscaling based on information coming from components running outside of cluster (for example length of queue in cloud messaging service, or QPS from loadbalancer running outside of cluster).
     * 
     */
    private final @Nullable ExternalMetricSource external;
    /**
     * object refers to a metric describing a single kubernetes object (for example, hits-per-second on an Ingress object).
     * 
     */
    private final @Nullable ObjectMetricSource object;
    /**
     * pods refers to a metric describing each pod in the current scale target (for example, transactions-processed-per-second).  The values will be averaged together before being compared to the target value.
     * 
     */
    private final @Nullable PodsMetricSource pods;
    /**
     * resource refers to a resource metric (such as those specified in requests and limits) known to Kubernetes describing each pod in the current scale target (e.g. CPU or memory). Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the "pods" source.
     * 
     */
    private final @Nullable ResourceMetricSource resource;
    /**
     * type is the type of metric source.  It should be one of "ContainerResource", "External", "Object", "Pods" or "Resource", each mapping to a matching field in the object. Note: "ContainerResource" type is available on when the feature-gate HPAContainerMetrics is enabled
     * 
     */
    private final String type;

    @CustomType.Constructor
    private MetricSpec(
        @CustomType.Parameter("containerResource") @Nullable ContainerResourceMetricSource containerResource,
        @CustomType.Parameter("external") @Nullable ExternalMetricSource external,
        @CustomType.Parameter("object") @Nullable ObjectMetricSource object,
        @CustomType.Parameter("pods") @Nullable PodsMetricSource pods,
        @CustomType.Parameter("resource") @Nullable ResourceMetricSource resource,
        @CustomType.Parameter("type") String type) {
        this.containerResource = containerResource;
        this.external = external;
        this.object = object;
        this.pods = pods;
        this.resource = resource;
        this.type = type;
    }

    /**
     * containerResource refers to a resource metric (such as those specified in requests and limits) known to Kubernetes describing a single container in each pod of the current scale target (e.g. CPU or memory). Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the "pods" source. This is an alpha feature and can be enabled by the HPAContainerMetrics feature flag.
     * 
    */
    public Optional<ContainerResourceMetricSource> getContainerResource() {
        return Optional.ofNullable(this.containerResource);
    }
    /**
     * external refers to a global metric that is not associated with any Kubernetes object. It allows autoscaling based on information coming from components running outside of cluster (for example length of queue in cloud messaging service, or QPS from loadbalancer running outside of cluster).
     * 
    */
    public Optional<ExternalMetricSource> getExternal() {
        return Optional.ofNullable(this.external);
    }
    /**
     * object refers to a metric describing a single kubernetes object (for example, hits-per-second on an Ingress object).
     * 
    */
    public Optional<ObjectMetricSource> getObject() {
        return Optional.ofNullable(this.object);
    }
    /**
     * pods refers to a metric describing each pod in the current scale target (for example, transactions-processed-per-second).  The values will be averaged together before being compared to the target value.
     * 
    */
    public Optional<PodsMetricSource> getPods() {
        return Optional.ofNullable(this.pods);
    }
    /**
     * resource refers to a resource metric (such as those specified in requests and limits) known to Kubernetes describing each pod in the current scale target (e.g. CPU or memory). Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the "pods" source.
     * 
    */
    public Optional<ResourceMetricSource> getResource() {
        return Optional.ofNullable(this.resource);
    }
    /**
     * type is the type of metric source.  It should be one of "ContainerResource", "External", "Object", "Pods" or "Resource", each mapping to a matching field in the object. Note: "ContainerResource" type is available on when the feature-gate HPAContainerMetrics is enabled
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricSpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ContainerResourceMetricSource containerResource;
        private @Nullable ExternalMetricSource external;
        private @Nullable ObjectMetricSource object;
        private @Nullable PodsMetricSource pods;
        private @Nullable ResourceMetricSource resource;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerResource = defaults.containerResource;
    	      this.external = defaults.external;
    	      this.object = defaults.object;
    	      this.pods = defaults.pods;
    	      this.resource = defaults.resource;
    	      this.type = defaults.type;
        }

        public Builder containerResource(@Nullable ContainerResourceMetricSource containerResource) {
            this.containerResource = containerResource;
            return this;
        }

        public Builder external(@Nullable ExternalMetricSource external) {
            this.external = external;
            return this;
        }

        public Builder object(@Nullable ObjectMetricSource object) {
            this.object = object;
            return this;
        }

        public Builder pods(@Nullable PodsMetricSource pods) {
            this.pods = pods;
            return this;
        }

        public Builder resource(@Nullable ResourceMetricSource resource) {
            this.resource = resource;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public MetricSpec build() {
            return new MetricSpec(containerResource, external, object, pods, resource, type);
        }
    }
}
