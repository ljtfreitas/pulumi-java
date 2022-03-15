// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudformation;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.cloudformation.ModuleVersionArgs;
import io.pulumi.awsnative.cloudformation.enums.ModuleVersionVisibility;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * A module that has been registered in the CloudFormation registry.
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws-native:cloudformation:ModuleVersion")
public class ModuleVersion extends io.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) of the module.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the module.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The description of the registered module.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return The description of the registered module.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * The URL of a page providing detailed documentation for this module.
     * 
     */
    @Export(name="documentationUrl", type=String.class, parameters={})
    private Output<String> documentationUrl;

    /**
     * @return The URL of a page providing detailed documentation for this module.
     * 
     */
    public Output<String> getDocumentationUrl() {
        return this.documentationUrl;
    }
    /**
     * Indicator of whether this module version is the current default version
     * 
     */
    @Export(name="isDefaultVersion", type=Boolean.class, parameters={})
    private Output<Boolean> isDefaultVersion;

    /**
     * @return Indicator of whether this module version is the current default version
     * 
     */
    public Output<Boolean> getIsDefaultVersion() {
        return this.isDefaultVersion;
    }
    /**
     * The name of the module being registered.
     * 
     * Recommended module naming pattern: company_or_organization::service::type::MODULE.
     * 
     */
    @Export(name="moduleName", type=String.class, parameters={})
    private Output<String> moduleName;

    /**
     * @return The name of the module being registered.
     * 
     * Recommended module naming pattern: company_or_organization::service::type::MODULE.
     * 
     */
    public Output<String> getModuleName() {
        return this.moduleName;
    }
    /**
     * The url to the S3 bucket containing the schema and template fragment for the module you want to register.
     * 
     */
    @Export(name="modulePackage", type=String.class, parameters={})
    private Output<String> modulePackage;

    /**
     * @return The url to the S3 bucket containing the schema and template fragment for the module you want to register.
     * 
     */
    public Output<String> getModulePackage() {
        return this.modulePackage;
    }
    /**
     * The schema defining input parameters to and resources generated by the module.
     * 
     */
    @Export(name="schema", type=String.class, parameters={})
    private Output<String> schema;

    /**
     * @return The schema defining input parameters to and resources generated by the module.
     * 
     */
    public Output<String> getSchema() {
        return this.schema;
    }
    /**
     * The time that the specified module version was registered.
     * 
     */
    @Export(name="timeCreated", type=String.class, parameters={})
    private Output<String> timeCreated;

    /**
     * @return The time that the specified module version was registered.
     * 
     */
    public Output<String> getTimeCreated() {
        return this.timeCreated;
    }
    /**
     * The version ID of the module represented by this module instance.
     * 
     */
    @Export(name="versionId", type=String.class, parameters={})
    private Output<String> versionId;

    /**
     * @return The version ID of the module represented by this module instance.
     * 
     */
    public Output<String> getVersionId() {
        return this.versionId;
    }
    /**
     * The scope at which the type is visible and usable in CloudFormation operations.
     * 
     * The only allowed value at present is:
     * 
     * PRIVATE: The type is only visible and usable within the account in which it is registered. Currently, AWS CloudFormation marks any types you register as PRIVATE.
     * 
     */
    @Export(name="visibility", type=ModuleVersionVisibility.class, parameters={})
    private Output<ModuleVersionVisibility> visibility;

    /**
     * @return The scope at which the type is visible and usable in CloudFormation operations.
     * 
     * The only allowed value at present is:
     * 
     * PRIVATE: The type is only visible and usable within the account in which it is registered. Currently, AWS CloudFormation marks any types you register as PRIVATE.
     * 
     */
    public Output<ModuleVersionVisibility> getVisibility() {
        return this.visibility;
    }

    public interface BuilderApplicator {
        public void apply(ModuleVersionArgs.Builder a);
    }
    private static io.pulumi.awsnative.cloudformation.ModuleVersionArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.cloudformation.ModuleVersionArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ModuleVersion(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ModuleVersion(String name) {
        this(name, ModuleVersionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ModuleVersion(String name, ModuleVersionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ModuleVersion(String name, ModuleVersionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:cloudformation:ModuleVersion", name, args == null ? ModuleVersionArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private ModuleVersion(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:cloudformation:ModuleVersion", name, null, makeResourceOptions(options, id));
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
    public static ModuleVersion get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ModuleVersion(name, id, options);
    }
}
