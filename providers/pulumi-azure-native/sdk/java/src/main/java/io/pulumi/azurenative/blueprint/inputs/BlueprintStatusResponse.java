// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.blueprint.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * The status of the blueprint. This field is readonly.
 * 
 */
public final class BlueprintStatusResponse extends io.pulumi.resources.InvokeArgs {

    public static final BlueprintStatusResponse Empty = new BlueprintStatusResponse();

    /**
     * Last modified time of this blueprint definition.
     * 
     */
    @InputImport(name="lastModified", required=true)
    private final String lastModified;

    public String getLastModified() {
        return this.lastModified;
    }

    /**
     * Creation time of this blueprint definition.
     * 
     */
    @InputImport(name="timeCreated", required=true)
    private final String timeCreated;

    public String getTimeCreated() {
        return this.timeCreated;
    }

    public BlueprintStatusResponse(
        String lastModified,
        String timeCreated) {
        this.lastModified = Objects.requireNonNull(lastModified, "expected parameter 'lastModified' to be non-null");
        this.timeCreated = Objects.requireNonNull(timeCreated, "expected parameter 'timeCreated' to be non-null");
    }

    private BlueprintStatusResponse() {
        this.lastModified = null;
        this.timeCreated = null;
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

        public Builder setLastModified(String lastModified) {
            this.lastModified = Objects.requireNonNull(lastModified);
            return this;
        }

        public Builder setTimeCreated(String timeCreated) {
            this.timeCreated = Objects.requireNonNull(timeCreated);
            return this;
        }

        public BlueprintStatusResponse build() {
            return new BlueprintStatusResponse(lastModified, timeCreated);
        }
    }
}
