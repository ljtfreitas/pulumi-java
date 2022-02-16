// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.kubernetes.core_v1.outputs.NodeSelector;
import io.pulumi.kubernetes.core_v1.outputs.PreferredSchedulingTerm;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class NodeAffinity {
    private final @Nullable List<PreferredSchedulingTerm> preferredDuringSchedulingIgnoredDuringExecution;
    private final @Nullable NodeSelector requiredDuringSchedulingIgnoredDuringExecution;

    @OutputCustomType.Constructor({"preferredDuringSchedulingIgnoredDuringExecution","requiredDuringSchedulingIgnoredDuringExecution"})
    private NodeAffinity(
        @Nullable List<PreferredSchedulingTerm> preferredDuringSchedulingIgnoredDuringExecution,
        @Nullable NodeSelector requiredDuringSchedulingIgnoredDuringExecution) {
        this.preferredDuringSchedulingIgnoredDuringExecution = preferredDuringSchedulingIgnoredDuringExecution;
        this.requiredDuringSchedulingIgnoredDuringExecution = requiredDuringSchedulingIgnoredDuringExecution;
    }

    public List<PreferredSchedulingTerm> getPreferredDuringSchedulingIgnoredDuringExecution() {
        return this.preferredDuringSchedulingIgnoredDuringExecution == null ? List.of() : this.preferredDuringSchedulingIgnoredDuringExecution;
    }
    public Optional<NodeSelector> getRequiredDuringSchedulingIgnoredDuringExecution() {
        return Optional.ofNullable(this.requiredDuringSchedulingIgnoredDuringExecution);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeAffinity defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<PreferredSchedulingTerm> preferredDuringSchedulingIgnoredDuringExecution;
        private @Nullable NodeSelector requiredDuringSchedulingIgnoredDuringExecution;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeAffinity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.preferredDuringSchedulingIgnoredDuringExecution = defaults.preferredDuringSchedulingIgnoredDuringExecution;
    	      this.requiredDuringSchedulingIgnoredDuringExecution = defaults.requiredDuringSchedulingIgnoredDuringExecution;
        }

        public Builder setPreferredDuringSchedulingIgnoredDuringExecution(@Nullable List<PreferredSchedulingTerm> preferredDuringSchedulingIgnoredDuringExecution) {
            this.preferredDuringSchedulingIgnoredDuringExecution = preferredDuringSchedulingIgnoredDuringExecution;
            return this;
        }

        public Builder setRequiredDuringSchedulingIgnoredDuringExecution(@Nullable NodeSelector requiredDuringSchedulingIgnoredDuringExecution) {
            this.requiredDuringSchedulingIgnoredDuringExecution = requiredDuringSchedulingIgnoredDuringExecution;
            return this;
        }

        public NodeAffinity build() {
            return new NodeAffinity(preferredDuringSchedulingIgnoredDuringExecution, requiredDuringSchedulingIgnoredDuringExecution);
        }
    }
}