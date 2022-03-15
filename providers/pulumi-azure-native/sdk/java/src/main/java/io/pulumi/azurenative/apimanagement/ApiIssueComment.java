// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.apimanagement.ApiIssueCommentArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Issue Comment Contract details.
 * API Version: 2020-12-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:apimanagement:ApiIssueComment 599e29ab193c3c0bd0b3e2fb /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.ApiManagement/service/apimService1/apis/57d1f7558aa04f15146d9d8a/issues/57d2ef278aa04f0ad01d6cdc/comments/599e29ab193c3c0bd0b3e2fb 
 * ```
 * 
 */
@ResourceType(type="azure-native:apimanagement:ApiIssueComment")
public class ApiIssueComment extends io.pulumi.resources.CustomResource {
    /**
     * Date and time when the comment was created.
     * 
     */
    @Export(name="createdDate", type=String.class, parameters={})
    private Output</* @Nullable */ String> createdDate;

    /**
     * @return Date and time when the comment was created.
     * 
     */
    public Output</* @Nullable */ String> getCreatedDate() {
        return this.createdDate;
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
     * Comment text.
     * 
     */
    @Export(name="text", type=String.class, parameters={})
    private Output<String> text;

    /**
     * @return Comment text.
     * 
     */
    public Output<String> getText() {
        return this.text;
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
     * A resource identifier for the user who left the comment.
     * 
     */
    @Export(name="userId", type=String.class, parameters={})
    private Output<String> userId;

    /**
     * @return A resource identifier for the user who left the comment.
     * 
     */
    public Output<String> getUserId() {
        return this.userId;
    }

    public interface BuilderApplicator {
        public void apply(ApiIssueCommentArgs.Builder a);
    }
    private static io.pulumi.azurenative.apimanagement.ApiIssueCommentArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.apimanagement.ApiIssueCommentArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ApiIssueComment(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ApiIssueComment(String name) {
        this(name, ApiIssueCommentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ApiIssueComment(String name, ApiIssueCommentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ApiIssueComment(String name, ApiIssueCommentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:apimanagement:ApiIssueComment", name, args == null ? ApiIssueCommentArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private ApiIssueComment(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:apimanagement:ApiIssueComment", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:apimanagement/v20170301:ApiIssueComment").build()),
                Output.of(Alias.builder().setType("azure-native:apimanagement/v20180101:ApiIssueComment").build()),
                Output.of(Alias.builder().setType("azure-native:apimanagement/v20180601preview:ApiIssueComment").build()),
                Output.of(Alias.builder().setType("azure-native:apimanagement/v20190101:ApiIssueComment").build()),
                Output.of(Alias.builder().setType("azure-native:apimanagement/v20191201:ApiIssueComment").build()),
                Output.of(Alias.builder().setType("azure-native:apimanagement/v20191201preview:ApiIssueComment").build()),
                Output.of(Alias.builder().setType("azure-native:apimanagement/v20200601preview:ApiIssueComment").build()),
                Output.of(Alias.builder().setType("azure-native:apimanagement/v20201201:ApiIssueComment").build()),
                Output.of(Alias.builder().setType("azure-native:apimanagement/v20210101preview:ApiIssueComment").build()),
                Output.of(Alias.builder().setType("azure-native:apimanagement/v20210401preview:ApiIssueComment").build()),
                Output.of(Alias.builder().setType("azure-native:apimanagement/v20210801:ApiIssueComment").build())
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
    public static ApiIssueComment get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ApiIssueComment(name, id, options);
    }
}
