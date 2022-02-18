// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ServiceLoadMetricDescriptionResponse {
    /**
     * Used only for Stateless services. The default amount of load, as a number, that this service creates for this metric.
     * 
     */
    private final @Nullable Integer defaultLoad;
    /**
     * The name of the metric. If the service chooses to report load during runtime, the load metric name should match the name that is specified in Name exactly. Note that metric names are case sensitive.
     * 
     */
    private final String name;
    /**
     * Used only for Stateful services. The default amount of load, as a number, that this service creates for this metric when it is a Primary replica.
     * 
     */
    private final @Nullable Integer primaryDefaultLoad;
    /**
     * Used only for Stateful services. The default amount of load, as a number, that this service creates for this metric when it is a Secondary replica.
     * 
     */
    private final @Nullable Integer secondaryDefaultLoad;
    /**
     * The service load metric relative weight, compared to other metrics configured for this service, as a number.
     * 
     */
    private final @Nullable String weight;

    @OutputCustomType.Constructor({"defaultLoad","name","primaryDefaultLoad","secondaryDefaultLoad","weight"})
    private ServiceLoadMetricDescriptionResponse(
        @Nullable Integer defaultLoad,
        String name,
        @Nullable Integer primaryDefaultLoad,
        @Nullable Integer secondaryDefaultLoad,
        @Nullable String weight) {
        this.defaultLoad = defaultLoad;
        this.name = Objects.requireNonNull(name);
        this.primaryDefaultLoad = primaryDefaultLoad;
        this.secondaryDefaultLoad = secondaryDefaultLoad;
        this.weight = weight;
    }

    /**
     * Used only for Stateless services. The default amount of load, as a number, that this service creates for this metric.
     * 
     */
    public Optional<Integer> getDefaultLoad() {
        return Optional.ofNullable(this.defaultLoad);
    }
    /**
     * The name of the metric. If the service chooses to report load during runtime, the load metric name should match the name that is specified in Name exactly. Note that metric names are case sensitive.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Used only for Stateful services. The default amount of load, as a number, that this service creates for this metric when it is a Primary replica.
     * 
     */
    public Optional<Integer> getPrimaryDefaultLoad() {
        return Optional.ofNullable(this.primaryDefaultLoad);
    }
    /**
     * Used only for Stateful services. The default amount of load, as a number, that this service creates for this metric when it is a Secondary replica.
     * 
     */
    public Optional<Integer> getSecondaryDefaultLoad() {
        return Optional.ofNullable(this.secondaryDefaultLoad);
    }
    /**
     * The service load metric relative weight, compared to other metrics configured for this service, as a number.
     * 
     */
    public Optional<String> getWeight() {
        return Optional.ofNullable(this.weight);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceLoadMetricDescriptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer defaultLoad;
        private String name;
        private @Nullable Integer primaryDefaultLoad;
        private @Nullable Integer secondaryDefaultLoad;
        private @Nullable String weight;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceLoadMetricDescriptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultLoad = defaults.defaultLoad;
    	      this.name = defaults.name;
    	      this.primaryDefaultLoad = defaults.primaryDefaultLoad;
    	      this.secondaryDefaultLoad = defaults.secondaryDefaultLoad;
    	      this.weight = defaults.weight;
        }

        public Builder setDefaultLoad(@Nullable Integer defaultLoad) {
            this.defaultLoad = defaultLoad;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPrimaryDefaultLoad(@Nullable Integer primaryDefaultLoad) {
            this.primaryDefaultLoad = primaryDefaultLoad;
            return this;
        }

        public Builder setSecondaryDefaultLoad(@Nullable Integer secondaryDefaultLoad) {
            this.secondaryDefaultLoad = secondaryDefaultLoad;
            return this;
        }

        public Builder setWeight(@Nullable String weight) {
            this.weight = weight;
            return this;
        }

        public ServiceLoadMetricDescriptionResponse build() {
            return new ServiceLoadMetricDescriptionResponse(defaultLoad, name, primaryDefaultLoad, secondaryDefaultLoad, weight);
        }
    }
}
