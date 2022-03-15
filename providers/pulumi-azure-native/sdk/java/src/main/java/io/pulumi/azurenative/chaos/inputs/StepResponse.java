// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.chaos.inputs;

import io.pulumi.azurenative.chaos.inputs.BranchResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Model that represents a step in the Experiment resource.
 * 
 */
public final class StepResponse extends io.pulumi.resources.InvokeArgs {

    public static final StepResponse Empty = new StepResponse();

    /**
     * List of branches.
     * 
     */
    @Import(name="branches", required=true)
      private final List<BranchResponse> branches;

    public List<BranchResponse> getBranches() {
        return this.branches;
    }

    /**
     * String of the step name.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    public StepResponse(
        List<BranchResponse> branches,
        String name) {
        this.branches = Objects.requireNonNull(branches, "expected parameter 'branches' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private StepResponse() {
        this.branches = List.of();
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StepResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<BranchResponse> branches;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(StepResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.branches = defaults.branches;
    	      this.name = defaults.name;
        }

        public Builder branches(List<BranchResponse> branches) {
            this.branches = Objects.requireNonNull(branches);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public StepResponse build() {
            return new StepResponse(branches, name);
        }
    }
}
