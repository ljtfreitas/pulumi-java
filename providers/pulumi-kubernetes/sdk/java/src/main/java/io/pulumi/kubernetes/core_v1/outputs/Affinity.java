// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.kubernetes.core_v1.outputs.NodeAffinity;
import io.pulumi.kubernetes.core_v1.outputs.PodAffinity;
import io.pulumi.kubernetes.core_v1.outputs.PodAntiAffinity;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class Affinity {
    private final @Nullable NodeAffinity nodeAffinity;
    private final @Nullable PodAffinity podAffinity;
    private final @Nullable PodAntiAffinity podAntiAffinity;

    @OutputCustomType.Constructor({"nodeAffinity","podAffinity","podAntiAffinity"})
    private Affinity(
        @Nullable NodeAffinity nodeAffinity,
        @Nullable PodAffinity podAffinity,
        @Nullable PodAntiAffinity podAntiAffinity) {
        this.nodeAffinity = nodeAffinity;
        this.podAffinity = podAffinity;
        this.podAntiAffinity = podAntiAffinity;
    }

    public Optional<NodeAffinity> getNodeAffinity() {
        return Optional.ofNullable(this.nodeAffinity);
    }
    public Optional<PodAffinity> getPodAffinity() {
        return Optional.ofNullable(this.podAffinity);
    }
    public Optional<PodAntiAffinity> getPodAntiAffinity() {
        return Optional.ofNullable(this.podAntiAffinity);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Affinity defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable NodeAffinity nodeAffinity;
        private @Nullable PodAffinity podAffinity;
        private @Nullable PodAntiAffinity podAntiAffinity;

        public Builder() {
    	      // Empty
        }

        public Builder(Affinity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nodeAffinity = defaults.nodeAffinity;
    	      this.podAffinity = defaults.podAffinity;
    	      this.podAntiAffinity = defaults.podAntiAffinity;
        }

        public Builder setNodeAffinity(@Nullable NodeAffinity nodeAffinity) {
            this.nodeAffinity = nodeAffinity;
            return this;
        }

        public Builder setPodAffinity(@Nullable PodAffinity podAffinity) {
            this.podAffinity = podAffinity;
            return this;
        }

        public Builder setPodAntiAffinity(@Nullable PodAntiAffinity podAntiAffinity) {
            this.podAntiAffinity = podAntiAffinity;
            return this;
        }

        public Affinity build() {
            return new Affinity(nodeAffinity, podAffinity, podAntiAffinity);
        }
    }
}