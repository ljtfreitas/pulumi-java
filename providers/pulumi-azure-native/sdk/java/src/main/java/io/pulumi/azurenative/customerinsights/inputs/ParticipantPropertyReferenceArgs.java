// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * The participant property reference.
 * 
 */
public final class ParticipantPropertyReferenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ParticipantPropertyReferenceArgs Empty = new ParticipantPropertyReferenceArgs();

    /**
     * The source property that maps to the target property.
     * 
     */
    @InputImport(name="sourcePropertyName", required=true)
        private final Input<String> sourcePropertyName;

    public Input<String> getSourcePropertyName() {
        return this.sourcePropertyName;
    }

    /**
     * The target property that maps to the source property.
     * 
     */
    @InputImport(name="targetPropertyName", required=true)
        private final Input<String> targetPropertyName;

    public Input<String> getTargetPropertyName() {
        return this.targetPropertyName;
    }

    public ParticipantPropertyReferenceArgs(
        Input<String> sourcePropertyName,
        Input<String> targetPropertyName) {
        this.sourcePropertyName = Objects.requireNonNull(sourcePropertyName, "expected parameter 'sourcePropertyName' to be non-null");
        this.targetPropertyName = Objects.requireNonNull(targetPropertyName, "expected parameter 'targetPropertyName' to be non-null");
    }

    private ParticipantPropertyReferenceArgs() {
        this.sourcePropertyName = Input.empty();
        this.targetPropertyName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ParticipantPropertyReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> sourcePropertyName;
        private Input<String> targetPropertyName;

        public Builder() {
    	      // Empty
        }

        public Builder(ParticipantPropertyReferenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sourcePropertyName = defaults.sourcePropertyName;
    	      this.targetPropertyName = defaults.targetPropertyName;
        }

        public Builder setSourcePropertyName(Input<String> sourcePropertyName) {
            this.sourcePropertyName = Objects.requireNonNull(sourcePropertyName);
            return this;
        }

        public Builder setSourcePropertyName(String sourcePropertyName) {
            this.sourcePropertyName = Input.of(Objects.requireNonNull(sourcePropertyName));
            return this;
        }

        public Builder setTargetPropertyName(Input<String> targetPropertyName) {
            this.targetPropertyName = Objects.requireNonNull(targetPropertyName);
            return this;
        }

        public Builder setTargetPropertyName(String targetPropertyName) {
            this.targetPropertyName = Input.of(Objects.requireNonNull(targetPropertyName));
            return this;
        }
        public ParticipantPropertyReferenceArgs build() {
            return new ParticipantPropertyReferenceArgs(sourcePropertyName, targetPropertyName);
        }
    }
}
