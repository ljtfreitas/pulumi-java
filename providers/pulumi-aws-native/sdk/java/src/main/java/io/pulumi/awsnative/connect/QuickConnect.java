// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.connect;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.connect.QuickConnectArgs;
import io.pulumi.awsnative.connect.outputs.QuickConnectConfig;
import io.pulumi.awsnative.connect.outputs.QuickConnectTag;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::Connect::QuickConnect
 * 
 */
@ResourceType(type="aws-native:connect:QuickConnect")
public class QuickConnect extends io.pulumi.resources.CustomResource {
    /**
     * The description of the quick connect.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the quick connect.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * The identifier of the Amazon Connect instance.
     * 
     */
    @Export(name="instanceArn", type=String.class, parameters={})
    private Output<String> instanceArn;

    /**
     * @return The identifier of the Amazon Connect instance.
     * 
     */
    public Output<String> getInstanceArn() {
        return this.instanceArn;
    }
    /**
     * The name of the quick connect.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the quick connect.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The Amazon Resource Name (ARN) for the quick connect.
     * 
     */
    @Export(name="quickConnectArn", type=String.class, parameters={})
    private Output<String> quickConnectArn;

    /**
     * @return The Amazon Resource Name (ARN) for the quick connect.
     * 
     */
    public Output<String> getQuickConnectArn() {
        return this.quickConnectArn;
    }
    /**
     * Configuration settings for the quick connect.
     * 
     */
    @Export(name="quickConnectConfig", type=QuickConnectConfig.class, parameters={})
    private Output<QuickConnectConfig> quickConnectConfig;

    /**
     * @return Configuration settings for the quick connect.
     * 
     */
    public Output<QuickConnectConfig> getQuickConnectConfig() {
        return this.quickConnectConfig;
    }
    /**
     * One or more tags.
     * 
     */
    @Export(name="tags", type=List.class, parameters={QuickConnectTag.class})
    private Output</* @Nullable */ List<QuickConnectTag>> tags;

    /**
     * @return One or more tags.
     * 
     */
    public Output</* @Nullable */ List<QuickConnectTag>> getTags() {
        return this.tags;
    }

    public interface BuilderApplicator {
        public void apply(QuickConnectArgs.Builder a);
    }
    private static io.pulumi.awsnative.connect.QuickConnectArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.connect.QuickConnectArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public QuickConnect(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public QuickConnect(String name) {
        this(name, QuickConnectArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public QuickConnect(String name, QuickConnectArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public QuickConnect(String name, QuickConnectArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:connect:QuickConnect", name, args == null ? QuickConnectArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private QuickConnect(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:connect:QuickConnect", name, null, makeResourceOptions(options, id));
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
    public static QuickConnect get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new QuickConnect(name, id, options);
    }
}
