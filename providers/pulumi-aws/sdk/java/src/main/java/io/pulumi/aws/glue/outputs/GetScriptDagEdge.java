// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetScriptDagEdge {
    /**
     * The ID of the node at which the edge starts.
     * 
     */
    private final String source;
    /**
     * The ID of the node at which the edge ends.
     * 
     */
    private final String target;
    /**
     * The target of the edge.
     * 
     */
    private final @Nullable String targetParameter;

    @CustomType.Constructor
    private GetScriptDagEdge(
        @CustomType.Parameter("source") String source,
        @CustomType.Parameter("target") String target,
        @CustomType.Parameter("targetParameter") @Nullable String targetParameter) {
        this.source = source;
        this.target = target;
        this.targetParameter = targetParameter;
    }

    /**
     * The ID of the node at which the edge starts.
     * 
    */
    public String getSource() {
        return this.source;
    }
    /**
     * The ID of the node at which the edge ends.
     * 
    */
    public String getTarget() {
        return this.target;
    }
    /**
     * The target of the edge.
     * 
    */
    public Optional<String> getTargetParameter() {
        return Optional.ofNullable(this.targetParameter);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetScriptDagEdge defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String source;
        private String target;
        private @Nullable String targetParameter;

        public Builder() {
    	      // Empty
        }

        public Builder(GetScriptDagEdge defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.source = defaults.source;
    	      this.target = defaults.target;
    	      this.targetParameter = defaults.targetParameter;
        }

        public Builder source(String source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }

        public Builder target(String target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }

        public Builder targetParameter(@Nullable String targetParameter) {
            this.targetParameter = targetParameter;
            return this;
        }
        public GetScriptDagEdge build() {
            return new GetScriptDagEdge(source, target, targetParameter);
        }
    }
}
