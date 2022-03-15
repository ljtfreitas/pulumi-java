// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.apimanagement.SubscriptionArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Subscription details.
 * API Version: 2020-12-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:apimanagement:Subscription testsub /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.ApiManagement/service/apimService1/subscriptions/testsub 
 * ```
 * 
 */
@ResourceType(type="azure-native:apimanagement:Subscription")
public class Subscription extends io.pulumi.resources.CustomResource {
    /**
     * Determines whether tracing is enabled
     * 
     */
    @Export(name="allowTracing", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> allowTracing;

    /**
     * @return Determines whether tracing is enabled
     * 
     */
    public Output</* @Nullable */ Boolean> getAllowTracing() {
        return this.allowTracing;
    }
    /**
     * Subscription creation date. The date conforms to the following format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601 standard.
     * 
     */
    @Export(name="createdDate", type=String.class, parameters={})
    private Output<String> createdDate;

    /**
     * @return Subscription creation date. The date conforms to the following format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601 standard.
     * 
     */
    public Output<String> getCreatedDate() {
        return this.createdDate;
    }
    /**
     * The name of the subscription, or null if the subscription has no name.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output</* @Nullable */ String> displayName;

    /**
     * @return The name of the subscription, or null if the subscription has no name.
     * 
     */
    public Output</* @Nullable */ String> getDisplayName() {
        return this.displayName;
    }
    /**
     * Date when subscription was cancelled or expired. The setting is for audit purposes only and the subscription is not automatically cancelled. The subscription lifecycle can be managed by using the `state` property. The date conforms to the following format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601 standard.
     * 
     */
    @Export(name="endDate", type=String.class, parameters={})
    private Output</* @Nullable */ String> endDate;

    /**
     * @return Date when subscription was cancelled or expired. The setting is for audit purposes only and the subscription is not automatically cancelled. The subscription lifecycle can be managed by using the `state` property. The date conforms to the following format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601 standard.
     * 
     */
    public Output</* @Nullable */ String> getEndDate() {
        return this.endDate;
    }
    /**
     * Subscription expiration date. The setting is for audit purposes only and the subscription is not automatically expired. The subscription lifecycle can be managed by using the `state` property. The date conforms to the following format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601 standard.
     * 
     */
    @Export(name="expirationDate", type=String.class, parameters={})
    private Output</* @Nullable */ String> expirationDate;

    /**
     * @return Subscription expiration date. The setting is for audit purposes only and the subscription is not automatically expired. The subscription lifecycle can be managed by using the `state` property. The date conforms to the following format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601 standard.
     * 
     */
    public Output</* @Nullable */ String> getExpirationDate() {
        return this.expirationDate;
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
     * Upcoming subscription expiration notification date. The date conforms to the following format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601 standard.
     * 
     */
    @Export(name="notificationDate", type=String.class, parameters={})
    private Output</* @Nullable */ String> notificationDate;

    /**
     * @return Upcoming subscription expiration notification date. The date conforms to the following format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601 standard.
     * 
     */
    public Output</* @Nullable */ String> getNotificationDate() {
        return this.notificationDate;
    }
    /**
     * The user resource identifier of the subscription owner. The value is a valid relative URL in the format of /users/{userId} where {userId} is a user identifier.
     * 
     */
    @Export(name="ownerId", type=String.class, parameters={})
    private Output</* @Nullable */ String> ownerId;

    /**
     * @return The user resource identifier of the subscription owner. The value is a valid relative URL in the format of /users/{userId} where {userId} is a user identifier.
     * 
     */
    public Output</* @Nullable */ String> getOwnerId() {
        return this.ownerId;
    }
    /**
     * Subscription primary key. This property will not be filled on 'GET' operations! Use '/listSecrets' POST request to get the value.
     * 
     */
    @Export(name="primaryKey", type=String.class, parameters={})
    private Output</* @Nullable */ String> primaryKey;

    /**
     * @return Subscription primary key. This property will not be filled on 'GET' operations! Use '/listSecrets' POST request to get the value.
     * 
     */
    public Output</* @Nullable */ String> getPrimaryKey() {
        return this.primaryKey;
    }
    /**
     * Scope like /products/{productId} or /apis or /apis/{apiId}.
     * 
     */
    @Export(name="scope", type=String.class, parameters={})
    private Output<String> scope;

    /**
     * @return Scope like /products/{productId} or /apis or /apis/{apiId}.
     * 
     */
    public Output<String> getScope() {
        return this.scope;
    }
    /**
     * Subscription secondary key. This property will not be filled on 'GET' operations! Use '/listSecrets' POST request to get the value.
     * 
     */
    @Export(name="secondaryKey", type=String.class, parameters={})
    private Output</* @Nullable */ String> secondaryKey;

    /**
     * @return Subscription secondary key. This property will not be filled on 'GET' operations! Use '/listSecrets' POST request to get the value.
     * 
     */
    public Output</* @Nullable */ String> getSecondaryKey() {
        return this.secondaryKey;
    }
    /**
     * Subscription activation date. The setting is for audit purposes only and the subscription is not automatically activated. The subscription lifecycle can be managed by using the `state` property. The date conforms to the following format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601 standard.
     * 
     */
    @Export(name="startDate", type=String.class, parameters={})
    private Output</* @Nullable */ String> startDate;

    /**
     * @return Subscription activation date. The setting is for audit purposes only and the subscription is not automatically activated. The subscription lifecycle can be managed by using the `state` property. The date conforms to the following format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601 standard.
     * 
     */
    public Output</* @Nullable */ String> getStartDate() {
        return this.startDate;
    }
    /**
     * Subscription state. Possible states are * active – the subscription is active, * suspended – the subscription is blocked, and the subscriber cannot call any APIs of the product, * submitted – the subscription request has been made by the developer, but has not yet been approved or rejected, * rejected – the subscription request has been denied by an administrator, * cancelled – the subscription has been cancelled by the developer or administrator, * expired – the subscription reached its expiration date and was deactivated.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return Subscription state. Possible states are * active – the subscription is active, * suspended – the subscription is blocked, and the subscriber cannot call any APIs of the product, * submitted – the subscription request has been made by the developer, but has not yet been approved or rejected, * rejected – the subscription request has been denied by an administrator, * cancelled – the subscription has been cancelled by the developer or administrator, * expired – the subscription reached its expiration date and was deactivated.
     * 
     */
    public Output<String> getState() {
        return this.state;
    }
    /**
     * Optional subscription comment added by an administrator when the state is changed to the 'rejected'.
     * 
     */
    @Export(name="stateComment", type=String.class, parameters={})
    private Output</* @Nullable */ String> stateComment;

    /**
     * @return Optional subscription comment added by an administrator when the state is changed to the 'rejected'.
     * 
     */
    public Output</* @Nullable */ String> getStateComment() {
        return this.stateComment;
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

    public interface BuilderApplicator {
        public void apply(SubscriptionArgs.Builder a);
    }
    private static io.pulumi.azurenative.apimanagement.SubscriptionArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.apimanagement.SubscriptionArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Subscription(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Subscription(String name) {
        this(name, SubscriptionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Subscription(String name, SubscriptionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Subscription(String name, SubscriptionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:apimanagement:Subscription", name, args == null ? SubscriptionArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Subscription(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:apimanagement:Subscription", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:apimanagement/v20160707:Subscription").build()),
                Output.of(Alias.builder().setType("azure-native:apimanagement/v20161010:Subscription").build()),
                Output.of(Alias.builder().setType("azure-native:apimanagement/v20170301:Subscription").build()),
                Output.of(Alias.builder().setType("azure-native:apimanagement/v20180101:Subscription").build()),
                Output.of(Alias.builder().setType("azure-native:apimanagement/v20180601preview:Subscription").build()),
                Output.of(Alias.builder().setType("azure-native:apimanagement/v20190101:Subscription").build()),
                Output.of(Alias.builder().setType("azure-native:apimanagement/v20191201:Subscription").build()),
                Output.of(Alias.builder().setType("azure-native:apimanagement/v20191201preview:Subscription").build()),
                Output.of(Alias.builder().setType("azure-native:apimanagement/v20200601preview:Subscription").build()),
                Output.of(Alias.builder().setType("azure-native:apimanagement/v20201201:Subscription").build()),
                Output.of(Alias.builder().setType("azure-native:apimanagement/v20210101preview:Subscription").build()),
                Output.of(Alias.builder().setType("azure-native:apimanagement/v20210401preview:Subscription").build()),
                Output.of(Alias.builder().setType("azure-native:apimanagement/v20210801:Subscription").build())
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
    public static Subscription get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Subscription(name, id, options);
    }
}
