// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.redis.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetInstanceNode extends io.pulumi.resources.InvokeArgs {

    public static final GetInstanceNode Empty = new GetInstanceNode();

    @Import(name="id", required=true)
      private final String id;

    public String getId() {
        return this.id;
    }

    @Import(name="zone", required=true)
      private final String zone;

    public String getZone() {
        return this.zone;
    }

    public GetInstanceNode(
        String id,
        String zone) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.zone = Objects.requireNonNull(zone, "expected parameter 'zone' to be non-null");
    }

    private GetInstanceNode() {
        this.id = null;
        this.zone = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceNode defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String zone;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceNode defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.zone = defaults.zone;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder zone(String zone) {
            this.zone = Objects.requireNonNull(zone);
            return this;
        }
        public GetInstanceNode build() {
            return new GetInstanceNode(id, zone);
        }
    }
}
