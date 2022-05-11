// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.trafficmanager.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetGeographicalLocationResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String name;

    @CustomType.Constructor
    private GetGeographicalLocationResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGeographicalLocationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGeographicalLocationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public GetGeographicalLocationResult build() {
            return new GetGeographicalLocationResult(id, name);
        }
    }
}
