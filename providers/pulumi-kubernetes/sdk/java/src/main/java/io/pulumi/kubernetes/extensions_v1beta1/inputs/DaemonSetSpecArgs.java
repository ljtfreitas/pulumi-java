// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.extensions_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.kubernetes.core_v1.inputs.PodTemplateSpecArgs;
import io.pulumi.kubernetes.extensions_v1beta1.inputs.DaemonSetUpdateStrategyArgs;
import io.pulumi.kubernetes.meta_v1.inputs.LabelSelectorArgs;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * DaemonSetSpec is the specification of a daemon set.
 * 
 */
public final class DaemonSetSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final DaemonSetSpecArgs Empty = new DaemonSetSpecArgs();

    /**
     * The minimum number of seconds for which a newly created DaemonSet pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready).
     * 
     */
    @Import(name="minReadySeconds")
      private final @Nullable Output<Integer> minReadySeconds;

    public Output<Integer> getMinReadySeconds() {
        return this.minReadySeconds == null ? Output.empty() : this.minReadySeconds;
    }

    /**
     * The number of old history to retain to allow rollback. This is a pointer to distinguish between explicit zero and not specified. Defaults to 10.
     * 
     */
    @Import(name="revisionHistoryLimit")
      private final @Nullable Output<Integer> revisionHistoryLimit;

    public Output<Integer> getRevisionHistoryLimit() {
        return this.revisionHistoryLimit == null ? Output.empty() : this.revisionHistoryLimit;
    }

    /**
     * A label query over pods that are managed by the daemon set. Must match in order to be controlled. If empty, defaulted to labels on Pod template. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
     * 
     */
    @Import(name="selector")
      private final @Nullable Output<LabelSelectorArgs> selector;

    public Output<LabelSelectorArgs> getSelector() {
        return this.selector == null ? Output.empty() : this.selector;
    }

    /**
     * An object that describes the pod that will be created. The DaemonSet will create exactly one copy of this pod on every node that matches the template's node selector (or on every node if no node selector is specified). More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#pod-template
     * 
     */
    @Import(name="template", required=true)
      private final Output<PodTemplateSpecArgs> template;

    public Output<PodTemplateSpecArgs> getTemplate() {
        return this.template;
    }

    /**
     * DEPRECATED. A sequence number representing a specific generation of the template. Populated by the system. It can be set only during the creation.
     * 
     */
    @Import(name="templateGeneration")
      private final @Nullable Output<Integer> templateGeneration;

    public Output<Integer> getTemplateGeneration() {
        return this.templateGeneration == null ? Output.empty() : this.templateGeneration;
    }

    /**
     * An update strategy to replace existing DaemonSet pods with new pods.
     * 
     */
    @Import(name="updateStrategy")
      private final @Nullable Output<DaemonSetUpdateStrategyArgs> updateStrategy;

    public Output<DaemonSetUpdateStrategyArgs> getUpdateStrategy() {
        return this.updateStrategy == null ? Output.empty() : this.updateStrategy;
    }

    public DaemonSetSpecArgs(
        @Nullable Output<Integer> minReadySeconds,
        @Nullable Output<Integer> revisionHistoryLimit,
        @Nullable Output<LabelSelectorArgs> selector,
        Output<PodTemplateSpecArgs> template,
        @Nullable Output<Integer> templateGeneration,
        @Nullable Output<DaemonSetUpdateStrategyArgs> updateStrategy) {
        this.minReadySeconds = minReadySeconds;
        this.revisionHistoryLimit = revisionHistoryLimit;
        this.selector = selector;
        this.template = Objects.requireNonNull(template, "expected parameter 'template' to be non-null");
        this.templateGeneration = templateGeneration;
        this.updateStrategy = updateStrategy;
    }

    private DaemonSetSpecArgs() {
        this.minReadySeconds = Output.empty();
        this.revisionHistoryLimit = Output.empty();
        this.selector = Output.empty();
        this.template = Output.empty();
        this.templateGeneration = Output.empty();
        this.updateStrategy = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DaemonSetSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> minReadySeconds;
        private @Nullable Output<Integer> revisionHistoryLimit;
        private @Nullable Output<LabelSelectorArgs> selector;
        private Output<PodTemplateSpecArgs> template;
        private @Nullable Output<Integer> templateGeneration;
        private @Nullable Output<DaemonSetUpdateStrategyArgs> updateStrategy;

        public Builder() {
    	      // Empty
        }

        public Builder(DaemonSetSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.minReadySeconds = defaults.minReadySeconds;
    	      this.revisionHistoryLimit = defaults.revisionHistoryLimit;
    	      this.selector = defaults.selector;
    	      this.template = defaults.template;
    	      this.templateGeneration = defaults.templateGeneration;
    	      this.updateStrategy = defaults.updateStrategy;
        }

        public Builder minReadySeconds(@Nullable Output<Integer> minReadySeconds) {
            this.minReadySeconds = minReadySeconds;
            return this;
        }

        public Builder minReadySeconds(@Nullable Integer minReadySeconds) {
            this.minReadySeconds = Output.ofNullable(minReadySeconds);
            return this;
        }

        public Builder revisionHistoryLimit(@Nullable Output<Integer> revisionHistoryLimit) {
            this.revisionHistoryLimit = revisionHistoryLimit;
            return this;
        }

        public Builder revisionHistoryLimit(@Nullable Integer revisionHistoryLimit) {
            this.revisionHistoryLimit = Output.ofNullable(revisionHistoryLimit);
            return this;
        }

        public Builder selector(@Nullable Output<LabelSelectorArgs> selector) {
            this.selector = selector;
            return this;
        }

        public Builder selector(@Nullable LabelSelectorArgs selector) {
            this.selector = Output.ofNullable(selector);
            return this;
        }

        public Builder template(Output<PodTemplateSpecArgs> template) {
            this.template = Objects.requireNonNull(template);
            return this;
        }

        public Builder template(PodTemplateSpecArgs template) {
            this.template = Output.of(Objects.requireNonNull(template));
            return this;
        }

        public Builder templateGeneration(@Nullable Output<Integer> templateGeneration) {
            this.templateGeneration = templateGeneration;
            return this;
        }

        public Builder templateGeneration(@Nullable Integer templateGeneration) {
            this.templateGeneration = Output.ofNullable(templateGeneration);
            return this;
        }

        public Builder updateStrategy(@Nullable Output<DaemonSetUpdateStrategyArgs> updateStrategy) {
            this.updateStrategy = updateStrategy;
            return this;
        }

        public Builder updateStrategy(@Nullable DaemonSetUpdateStrategyArgs updateStrategy) {
            this.updateStrategy = Output.ofNullable(updateStrategy);
            return this;
        }
        public DaemonSetSpecArgs build() {
            return new DaemonSetSpecArgs(minReadySeconds, revisionHistoryLimit, selector, template, templateGeneration, updateStrategy);
        }
    }
}
