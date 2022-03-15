// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudformation;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.cloudformation.HookTypeConfigArgs;
import io.pulumi.awsnative.cloudformation.enums.HookTypeConfigConfigurationAlias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Specifies the configuration data for a registered hook in CloudFormation Registry.
 * 
 */
@ResourceType(type="aws-native:cloudformation:HookTypeConfig")
public class HookTypeConfig extends io.pulumi.resources.CustomResource {
    /**
     * The configuration data for the extension, in this account and region.
     * 
     */
    @Export(name="configuration", type=String.class, parameters={})
    private Output</* @Nullable */ String> configuration;

    /**
     * @return The configuration data for the extension, in this account and region.
     * 
     */
    public Output</* @Nullable */ String> getConfiguration() {
        return this.configuration;
    }
    /**
     * An alias by which to refer to this extension configuration data.
     * 
     */
    @Export(name="configurationAlias", type=HookTypeConfigConfigurationAlias.class, parameters={})
    private Output</* @Nullable */ HookTypeConfigConfigurationAlias> configurationAlias;

    /**
     * @return An alias by which to refer to this extension configuration data.
     * 
     */
    public Output</* @Nullable */ HookTypeConfigConfigurationAlias> getConfigurationAlias() {
        return this.configurationAlias;
    }
    /**
     * The Amazon Resource Name (ARN) for the configuration data, in this account and region.
     * 
     */
    @Export(name="configurationArn", type=String.class, parameters={})
    private Output<String> configurationArn;

    /**
     * @return The Amazon Resource Name (ARN) for the configuration data, in this account and region.
     * 
     */
    public Output<String> getConfigurationArn() {
        return this.configurationArn;
    }
    /**
     * The Amazon Resource Name (ARN) of the type version.
     * 
     */
    @Export(name="typeArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> typeArn;

    /**
     * @return The Amazon Resource Name (ARN) of the type version.
     * 
     */
    public Output</* @Nullable */ String> getTypeArn() {
        return this.typeArn;
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

    public interface BuilderApplicator {
        public void apply(@Nullable HookTypeConfigArgs.Builder a);
    }
    private static io.pulumi.awsnative.cloudformation.HookTypeConfigArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.cloudformation.HookTypeConfigArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public HookTypeConfig(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public HookTypeConfig(String name) {
        this(name, HookTypeConfigArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public HookTypeConfig(String name, @Nullable HookTypeConfigArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public HookTypeConfig(String name, @Nullable HookTypeConfigArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:cloudformation:HookTypeConfig", name, args == null ? HookTypeConfigArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private HookTypeConfig(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:cloudformation:HookTypeConfig", name, null, makeResourceOptions(options, id));
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
    public static HookTypeConfig get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new HookTypeConfig(name, id, options);
    }
}
