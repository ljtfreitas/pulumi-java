// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.apimanagement.ApiIssueArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Issue Contract details.
 * API Version: 2020-12-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:apimanagement:ApiIssue 57d2ef278aa04f0ad01d6cdc /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.ApiManagement/service/apimService1/apis/57d1f7558aa04f15146d9d8a/issues/57d2ef278aa04f0ad01d6cdc 
 * ```
 * 
 */
@ResourceType(type="azure-native:apimanagement:ApiIssue")
public class ApiIssue extends io.pulumi.resources.CustomResource {
    /**
     * A resource identifier for the API the issue was created for.
     * 
     */
    @Export(name="apiId", type=String.class, parameters={})
    private Output</* @Nullable */ String> apiId;

    /**
     * @return A resource identifier for the API the issue was created for.
     * 
     */
    public Output</* @Nullable */ String> getApiId() {
        return this.apiId;
    }
    /**
     * Date and time when the issue was created.
     * 
     */
    @Export(name="createdDate", type=String.class, parameters={})
    private Output</* @Nullable */ String> createdDate;

    /**
     * @return Date and time when the issue was created.
     * 
     */
    public Output</* @Nullable */ String> getCreatedDate() {
        return this.createdDate;
    }
    /**
     * Text describing the issue.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return Text describing the issue.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * Resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Status of the issue.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output</* @Nullable */ String> state;

    /**
     * @return Status of the issue.
     * 
     */
    public Output</* @Nullable */ String> getState() {
        return this.state;
    }
    /**
     * The issue title.
     * 
     */
    @Export(name="title", type=String.class, parameters={})
    private Output<String> title;

    /**
     * @return The issue title.
     * 
     */
    public Output<String> getTitle() {
        return this.title;
    }
    /**
     * Resource type for API Management resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type for API Management resource.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * A resource identifier for the user created the issue.
     * 
     */
    @Export(name="userId", type=String.class, parameters={})
    private Output<String> userId;

    /**
     * @return A resource identifier for the user created the issue.
     * 
     */
    public Output<String> getUserId() {
        return this.userId;
    }

    public interface BuilderApplicator {
        public void apply(ApiIssueArgs.Builder a);
    }
    private static io.pulumi.azurenative.apimanagement.ApiIssueArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.apimanagement.ApiIssueArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ApiIssue(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ApiIssue(String name) {
        this(name, ApiIssueArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ApiIssue(String name, ApiIssueArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ApiIssue(String name, ApiIssueArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:apimanagement:ApiIssue", name, args == null ? ApiIssueArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private ApiIssue(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:apimanagement:ApiIssue", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:apimanagement/v20170301:ApiIssue").build()),
                Output.of(Alias.builder().setType("azure-native:apimanagement/v20180101:ApiIssue").build()),
                Output.of(Alias.builder().setType("azure-native:apimanagement/v20180601preview:ApiIssue").build()),
                Output.of(Alias.builder().setType("azure-native:apimanagement/v20190101:ApiIssue").build()),
                Output.of(Alias.builder().setType("azure-native:apimanagement/v20191201:ApiIssue").build()),
                Output.of(Alias.builder().setType("azure-native:apimanagement/v20191201preview:ApiIssue").build()),
                Output.of(Alias.builder().setType("azure-native:apimanagement/v20200601preview:ApiIssue").build()),
                Output.of(Alias.builder().setType("azure-native:apimanagement/v20201201:ApiIssue").build()),
                Output.of(Alias.builder().setType("azure-native:apimanagement/v20210101preview:ApiIssue").build()),
                Output.of(Alias.builder().setType("azure-native:apimanagement/v20210401preview:ApiIssue").build()),
                Output.of(Alias.builder().setType("azure-native:apimanagement/v20210801:ApiIssue").build())
            ))
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
    public static ApiIssue get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ApiIssue(name, id, options);
    }
}
