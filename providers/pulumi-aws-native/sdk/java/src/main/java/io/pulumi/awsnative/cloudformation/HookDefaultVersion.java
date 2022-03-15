// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudformation;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.cloudformation.HookDefaultVersionArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Set a version as default version for a hook in CloudFormation Registry.
 * 
 */
@ResourceType(type="aws-native:cloudformation:HookDefaultVersion")
public class HookDefaultVersion extends io.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) of the type. This is used to uniquely identify a HookDefaultVersion
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the type. This is used to uniquely identify a HookDefaultVersion
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The name of the type being registered.
     * 
     * We recommend that type names adhere to the following pattern: company_or_organization::service::type.
     * 
     */
    @Export(name="typeName", type=String.class, parameters={})
    private Output</* @Nullable */ String> typeName;

    /**
     * @return The name of the type being registered.
     * 
     * We recommend that type names adhere to the following pattern: company_or_organization::service::type.
     * 
     */
    public Output</* @Nullable */ String> getTypeName() {
        return this.typeName;
    }
    /**
     * The Amazon Resource Name (ARN) of the type version.
     * 
     */
    @Export(name="typeVersionArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> typeVersionArn;

    /**
     * @return The Amazon Resource Name (ARN) of the type version.
     * 
     */
    public Output</* @Nullable */ String> getTypeVersionArn() {
        return this.typeVersionArn;
    }
    /**
     * The ID of an existing version of the hook to set as the default.
     * 
     */
    @Export(name="versionId", type=String.class, parameters={})
    private Output</* @Nullable */ String> versionId;

    /**
     * @return The ID of an existing version of the hook to set as the default.
     * 
     */
    public Output</* @Nullable */ String> getVersionId() {
        return this.versionId;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable HookDefaultVersionArgs.Builder a);
    }
    private static io.pulumi.awsnative.cloudformation.HookDefaultVersionArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.cloudformation.HookDefaultVersionArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public HookDefaultVersion(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public HookDefaultVersion(String name) {
        this(name, HookDefaultVersionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public HookDefaultVersion(String name, @Nullable HookDefaultVersionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public HookDefaultVersion(String name, @Nullable HookDefaultVersionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:cloudformation:HookDefaultVersion", name, args == null ? HookDefaultVersionArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private HookDefaultVersion(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:cloudformation:HookDefaultVersion", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static HookDefaultVersion get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new HookDefaultVersion(name, id, options);
    }
}
