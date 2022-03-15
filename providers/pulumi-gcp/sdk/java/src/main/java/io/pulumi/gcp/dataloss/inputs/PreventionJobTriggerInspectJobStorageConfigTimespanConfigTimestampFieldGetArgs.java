// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class PreventionJobTriggerInspectJobStorageConfigTimespanConfigTimestampFieldGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PreventionJobTriggerInspectJobStorageConfigTimespanConfigTimestampFieldGetArgs Empty = new PreventionJobTriggerInspectJobStorageConfigTimespanConfigTimestampFieldGetArgs();

    /**
     * The name of the Datastore kind.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    public PreventionJobTriggerInspectJobStorageConfigTimespanConfigTimestampFieldGetArgs(Output<String> name) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private PreventionJobTriggerInspectJobStorageConfigTimespanConfigTimestampFieldGetArgs() {
        this.name = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionJobTriggerInspectJobStorageConfigTimespanConfigTimestampFieldGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionJobTriggerInspectJobStorageConfigTimespanConfigTimestampFieldGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public PreventionJobTriggerInspectJobStorageConfigTimespanConfigTimestampFieldGetArgs build() {
            return new PreventionJobTriggerInspectJobStorageConfigTimespanConfigTimestampFieldGetArgs(name);
        }
    }
}
