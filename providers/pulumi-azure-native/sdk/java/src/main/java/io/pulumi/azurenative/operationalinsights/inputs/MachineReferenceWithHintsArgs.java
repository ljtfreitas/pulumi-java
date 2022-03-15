// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationalinsights.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * A machine reference with a hint of the machine's name and operating system.
 * 
 */
public final class MachineReferenceWithHintsArgs extends io.pulumi.resources.ResourceArgs {

    public static final MachineReferenceWithHintsArgs Empty = new MachineReferenceWithHintsArgs();

    /**
     * Resource URI.
     * 
     */
    @Import(name="id", required=true)
      private final Output<String> id;

    public Output<String> getId() {
        return this.id;
    }

    /**
     * Specifies the sub-class of the reference.
     * Expected value is 'ref:machinewithhints'.
     * 
     */
    @Import(name="kind", required=true)
      private final Output<String> kind;

    public Output<String> getKind() {
        return this.kind;
    }

    public MachineReferenceWithHintsArgs(
        Output<String> id,
        Output<String> kind) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
    }

    private MachineReferenceWithHintsArgs() {
        this.id = Output.empty();
        this.kind = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MachineReferenceWithHintsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> id;
        private Output<String> kind;

        public Builder() {
    	      // Empty
        }

        public Builder(MachineReferenceWithHintsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
        }

        public Builder id(Output<String> id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder id(String id) {
            this.id = Output.of(Objects.requireNonNull(id));
            return this;
        }

        public Builder kind(Output<String> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder kind(String kind) {
            this.kind = Output.of(Objects.requireNonNull(kind));
            return this;
        }
        public MachineReferenceWithHintsArgs build() {
            return new MachineReferenceWithHintsArgs(id, kind);
        }
    }
}
