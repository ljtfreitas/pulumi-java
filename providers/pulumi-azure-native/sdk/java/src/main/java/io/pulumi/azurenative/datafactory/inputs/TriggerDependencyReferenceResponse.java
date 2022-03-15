// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.TriggerReferenceResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Trigger referenced dependency.
 * 
 */
public final class TriggerDependencyReferenceResponse extends io.pulumi.resources.InvokeArgs {

    public static final TriggerDependencyReferenceResponse Empty = new TriggerDependencyReferenceResponse();

    /**
     * Referenced trigger.
     * 
     */
    @Import(name="referenceTrigger", required=true)
      private final TriggerReferenceResponse referenceTrigger;

    public TriggerReferenceResponse getReferenceTrigger() {
        return this.referenceTrigger;
    }

    /**
     * The type of dependency reference.
     * Expected value is 'TriggerDependencyReference'.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public TriggerDependencyReferenceResponse(
        TriggerReferenceResponse referenceTrigger,
        String type) {
        this.referenceTrigger = Objects.requireNonNull(referenceTrigger, "expected parameter 'referenceTrigger' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private TriggerDependencyReferenceResponse() {
        this.referenceTrigger = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerDependencyReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TriggerReferenceResponse referenceTrigger;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerDependencyReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.referenceTrigger = defaults.referenceTrigger;
    	      this.type = defaults.type;
        }

        public Builder referenceTrigger(TriggerReferenceResponse referenceTrigger) {
            this.referenceTrigger = Objects.requireNonNull(referenceTrigger);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public TriggerDependencyReferenceResponse build() {
            return new TriggerDependencyReferenceResponse(referenceTrigger, type);
        }
    }
}
