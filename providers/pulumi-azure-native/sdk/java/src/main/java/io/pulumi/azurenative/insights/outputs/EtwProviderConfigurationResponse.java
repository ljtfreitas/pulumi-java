// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.azurenative.insights.outputs.EtwEventConfigurationResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class EtwProviderConfigurationResponse {
    private final List<EtwEventConfigurationResponse> events;
    private final String id;

    @CustomType.Constructor
    private EtwProviderConfigurationResponse(
        @CustomType.Parameter("events") List<EtwEventConfigurationResponse> events,
        @CustomType.Parameter("id") String id) {
        this.events = events;
        this.id = id;
    }

    public List<EtwEventConfigurationResponse> getEvents() {
        return this.events;
    }
    public String getId() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EtwProviderConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<EtwEventConfigurationResponse> events;
        private String id;

        public Builder() {
    	      // Empty
        }

        public Builder(EtwProviderConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.events = defaults.events;
    	      this.id = defaults.id;
        }

        public Builder events(List<EtwEventConfigurationResponse> events) {
            this.events = Objects.requireNonNull(events);
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public EtwProviderConfigurationResponse build() {
            return new EtwProviderConfigurationResponse(events, id);
        }
    }
}
