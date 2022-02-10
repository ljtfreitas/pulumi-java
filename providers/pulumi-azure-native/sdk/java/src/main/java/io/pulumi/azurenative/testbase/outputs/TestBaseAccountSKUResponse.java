// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.testbase.outputs;

import io.pulumi.azurenative.testbase.outputs.TestBaseAccountSKUCapabilityResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TestBaseAccountSKUResponse {
    private final List<TestBaseAccountSKUCapabilityResponse> capabilities;
    private final @Nullable List<String> locations;
    private final String name;
    private final @Nullable String resourceType;
    private final String tier;

    @OutputCustomType.Constructor({"capabilities","locations","name","resourceType","tier"})
    private TestBaseAccountSKUResponse(
        List<TestBaseAccountSKUCapabilityResponse> capabilities,
        @Nullable List<String> locations,
        String name,
        @Nullable String resourceType,
        String tier) {
        this.capabilities = Objects.requireNonNull(capabilities);
        this.locations = locations;
        this.name = Objects.requireNonNull(name);
        this.resourceType = resourceType;
        this.tier = Objects.requireNonNull(tier);
    }

    public List<TestBaseAccountSKUCapabilityResponse> getCapabilities() {
        return this.capabilities;
    }
    public List<String> getLocations() {
        return this.locations == null ? List.of() : this.locations;
    }
    public String getName() {
        return this.name;
    }
    public Optional<String> getPropResourceType() {
        return Optional.ofNullable(this.resourceType);
    }
    public String getTier() {
        return this.tier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TestBaseAccountSKUResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<TestBaseAccountSKUCapabilityResponse> capabilities;
        private @Nullable List<String> locations;
        private String name;
        private @Nullable String resourceType;
        private String tier;

        public Builder() {
    	      // Empty
        }

        public Builder(TestBaseAccountSKUResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capabilities = defaults.capabilities;
    	      this.locations = defaults.locations;
    	      this.name = defaults.name;
    	      this.resourceType = defaults.resourceType;
    	      this.tier = defaults.tier;
        }

        public Builder setCapabilities(List<TestBaseAccountSKUCapabilityResponse> capabilities) {
            this.capabilities = Objects.requireNonNull(capabilities);
            return this;
        }

        public Builder setLocations(@Nullable List<String> locations) {
            this.locations = locations;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setResourceType(@Nullable String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        public Builder setTier(String tier) {
            this.tier = Objects.requireNonNull(tier);
            return this;
        }

        public TestBaseAccountSKUResponse build() {
            return new TestBaseAccountSKUResponse(capabilities, locations, name, resourceType, tier);
        }
    }
}