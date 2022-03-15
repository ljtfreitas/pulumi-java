// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.sagemaker.AppArgs;
import io.pulumi.awsnative.sagemaker.enums.AppType;
import io.pulumi.awsnative.sagemaker.outputs.AppResourceSpec;
import io.pulumi.awsnative.sagemaker.outputs.AppTag;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::SageMaker::App
 * 
 */
@ResourceType(type="aws-native:sagemaker:App")
public class App extends io.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) of the app.
     * 
     */
    @Export(name="appArn", type=String.class, parameters={})
    private Output<String> appArn;

    /**
     * @return The Amazon Resource Name (ARN) of the app.
     * 
     */
    public Output<String> getAppArn() {
        return this.appArn;
    }
    /**
     * The name of the app.
     * 
     */
    @Export(name="appName", type=String.class, parameters={})
    private Output<String> appName;

    /**
     * @return The name of the app.
     * 
     */
    public Output<String> getAppName() {
        return this.appName;
    }
    /**
     * The type of app.
     * 
     */
    @Export(name="appType", type=AppType.class, parameters={})
    private Output<AppType> appType;

    /**
     * @return The type of app.
     * 
     */
    public Output<AppType> getAppType() {
        return this.appType;
    }
    /**
     * The domain ID.
     * 
     */
    @Export(name="domainId", type=String.class, parameters={})
    private Output<String> domainId;

    /**
     * @return The domain ID.
     * 
     */
    public Output<String> getDomainId() {
        return this.domainId;
    }
    /**
     * The instance type and the Amazon Resource Name (ARN) of the SageMaker image created on the instance.
     * 
     */
    @Export(name="resourceSpec", type=AppResourceSpec.class, parameters={})
    private Output</* @Nullable */ AppResourceSpec> resourceSpec;

    /**
     * @return The instance type and the Amazon Resource Name (ARN) of the SageMaker image created on the instance.
     * 
     */
    public Output</* @Nullable */ AppResourceSpec> getResourceSpec() {
        return this.resourceSpec;
    }
    /**
     * A list of tags to apply to the app.
     * 
     */
    @Export(name="tags", type=List.class, parameters={AppTag.class})
    private Output</* @Nullable */ List<AppTag>> tags;

    /**
     * @return A list of tags to apply to the app.
     * 
     */
    public Output</* @Nullable */ List<AppTag>> getTags() {
        return this.tags;
    }
    /**
     * The user profile name.
     * 
     */
    @Export(name="userProfileName", type=String.class, parameters={})
    private Output<String> userProfileName;

    /**
     * @return The user profile name.
     * 
     */
    public Output<String> getUserProfileName() {
        return this.userProfileName;
    }

    public interface BuilderApplicator {
        public void apply(AppArgs.Builder a);
    }
    private static io.pulumi.awsnative.sagemaker.AppArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.sagemaker.AppArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public App(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public App(String name) {
        this(name, AppArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public App(String name, AppArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public App(String name, AppArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:sagemaker:App", name, args == null ? AppArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private App(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:sagemaker:App", name, null, makeResourceOptions(options, id));
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
    public static App get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new App(name, id, options);
    }
}
