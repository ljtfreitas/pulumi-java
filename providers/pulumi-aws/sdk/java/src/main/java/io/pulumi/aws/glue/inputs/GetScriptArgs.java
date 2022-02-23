// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.inputs;

import io.pulumi.aws.glue.inputs.GetScriptDagEdge;
import io.pulumi.aws.glue.inputs.GetScriptDagNode;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetScriptArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetScriptArgs Empty = new GetScriptArgs();

    /**
     * A list of the edges in the DAG. Defined below.
     * 
     */
    @InputImport(name="dagEdges", required=true)
    private final List<GetScriptDagEdge> dagEdges;

    public List<GetScriptDagEdge> getDagEdges() {
        return this.dagEdges;
    }

    /**
     * A list of the nodes in the DAG. Defined below.
     * 
     */
    @InputImport(name="dagNodes", required=true)
    private final List<GetScriptDagNode> dagNodes;

    public List<GetScriptDagNode> getDagNodes() {
        return this.dagNodes;
    }

    /**
     * The programming language of the resulting code from the DAG. Defaults to `PYTHON`. Valid values are `PYTHON` and `SCALA`.
     * 
     */
    @InputImport(name="language")
    private final @Nullable String language;

    public Optional<String> getLanguage() {
        return this.language == null ? Optional.empty() : Optional.ofNullable(this.language);
    }

    public GetScriptArgs(
        List<GetScriptDagEdge> dagEdges,
        List<GetScriptDagNode> dagNodes,
        @Nullable String language) {
        this.dagEdges = Objects.requireNonNull(dagEdges, "expected parameter 'dagEdges' to be non-null");
        this.dagNodes = Objects.requireNonNull(dagNodes, "expected parameter 'dagNodes' to be non-null");
        this.language = language;
    }

    private GetScriptArgs() {
        this.dagEdges = List.of();
        this.dagNodes = List.of();
        this.language = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetScriptArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetScriptDagEdge> dagEdges;
        private List<GetScriptDagNode> dagNodes;
        private @Nullable String language;

        public Builder() {
    	      // Empty
        }

        public Builder(GetScriptArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dagEdges = defaults.dagEdges;
    	      this.dagNodes = defaults.dagNodes;
    	      this.language = defaults.language;
        }

        public Builder setDagEdges(List<GetScriptDagEdge> dagEdges) {
            this.dagEdges = Objects.requireNonNull(dagEdges);
            return this;
        }

        public Builder setDagNodes(List<GetScriptDagNode> dagNodes) {
            this.dagNodes = Objects.requireNonNull(dagNodes);
            return this;
        }

        public Builder setLanguage(@Nullable String language) {
            this.language = language;
            return this;
        }
        public GetScriptArgs build() {
            return new GetScriptArgs(dagEdges, dagNodes, language);
        }
    }
}
