// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.blueprint.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class BlueprintStatusResponse {
    /**
     * Last modified time of this blueprint definition.
     * 
     */
    private final String lastModified;
    /**
     * Creation time of this blueprint definition.
     * 
     */
    private final String timeCreated;

    @CustomType.Constructor
    private BlueprintStatusResponse(
        @CustomType.Parameter("lastModified") String lastModified,
        @CustomType.Parameter("timeCreated") String timeCreated) {
        this.lastModified = lastModified;
        this.timeCreated = timeCreated;
    }

    /**
     * Last modified time of this blueprint definition.
     * 
    */
    public String getLastModified() {
        return this.lastModified;
    }
    /**
     * Creation time of this blueprint definition.
     * 
    */
    public String getTimeCreated() {
        return this.timeCreated;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BlueprintStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String lastModified;
        private String timeCreated;

        public Builder() {
    	      // Empty
        }

        public Builder(BlueprintStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lastModified = defaults.lastModified;
    	      this.timeCreated = defaults.timeCreated;
        }

        public Builder lastModified(String lastModified) {
            this.lastModified = Objects.requireNonNull(lastModified);
            return this;
        }

        public Builder timeCreated(String timeCreated) {
            this.timeCreated = Objects.requireNonNull(timeCreated);
            return this;
        }
        public BlueprintStatusResponse build() {
            return new BlueprintStatusResponse(lastModified, timeCreated);
        }
    }
}
