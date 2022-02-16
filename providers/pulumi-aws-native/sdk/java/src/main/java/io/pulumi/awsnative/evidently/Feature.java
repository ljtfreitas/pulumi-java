// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.evidently;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.evidently.FeatureArgs;
import io.pulumi.awsnative.evidently.enums.FeatureEvaluationStrategy;
import io.pulumi.awsnative.evidently.outputs.FeatureEntityOverride;
import io.pulumi.awsnative.evidently.outputs.FeatureTag;
import io.pulumi.awsnative.evidently.outputs.FeatureVariationObject;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="aws-native:evidently:Feature")
public class Feature extends io.pulumi.resources.CustomResource {
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> getArn() {
        return this.arn;
    }
    @OutputExport(name="defaultVariation", type=String.class, parameters={})
    private Output</* @Nullable */ String> defaultVariation;

    public Output</* @Nullable */ String> getDefaultVariation() {
        return this.defaultVariation;
    }
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    @OutputExport(name="entityOverrides", type=List.class, parameters={FeatureEntityOverride.class})
    private Output</* @Nullable */ List<FeatureEntityOverride>> entityOverrides;

    public Output</* @Nullable */ List<FeatureEntityOverride>> getEntityOverrides() {
        return this.entityOverrides;
    }
    @OutputExport(name="evaluationStrategy", type=FeatureEvaluationStrategy.class, parameters={})
    private Output</* @Nullable */ FeatureEvaluationStrategy> evaluationStrategy;

    public Output</* @Nullable */ FeatureEvaluationStrategy> getEvaluationStrategy() {
        return this.evaluationStrategy;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> getProject() {
        return this.project;
    }
    @OutputExport(name="tags", type=List.class, parameters={FeatureTag.class})
    private Output</* @Nullable */ List<FeatureTag>> tags;

    public Output</* @Nullable */ List<FeatureTag>> getTags() {
        return this.tags;
    }
    @OutputExport(name="variations", type=List.class, parameters={FeatureVariationObject.class})
    private Output<List<FeatureVariationObject>> variations;

    public Output<List<FeatureVariationObject>> getVariations() {
        return this.variations;
    }

    public Feature(String name, FeatureArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:evidently:Feature", name, args == null ? FeatureArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Feature(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:evidently:Feature", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Feature get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Feature(name, id, options);
    }
}