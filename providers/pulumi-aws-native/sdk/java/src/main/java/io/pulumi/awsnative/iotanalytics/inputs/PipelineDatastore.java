// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class PipelineDatastore extends io.pulumi.resources.InvokeArgs {

    public static final PipelineDatastore Empty = new PipelineDatastore();

    @Import(name="datastoreName", required=true)
      private final String datastoreName;

    public String getDatastoreName() {
        return this.datastoreName;
    }

    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    public PipelineDatastore(
        String datastoreName,
        String name) {
        this.datastoreName = Objects.requireNonNull(datastoreName, "expected parameter 'datastoreName' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private PipelineDatastore() {
        this.datastoreName = null;
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineDatastore defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String datastoreName;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineDatastore defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datastoreName = defaults.datastoreName;
    	      this.name = defaults.name;
        }

        public Builder datastoreName(String datastoreName) {
            this.datastoreName = Objects.requireNonNull(datastoreName);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public PipelineDatastore build() {
            return new PipelineDatastore(datastoreName, name);
        }
    }
}
