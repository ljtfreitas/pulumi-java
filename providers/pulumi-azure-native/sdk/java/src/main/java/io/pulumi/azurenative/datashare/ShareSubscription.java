// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datashare;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.datashare.ShareSubscriptionArgs;
import io.pulumi.azurenative.datashare.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * A share subscription data transfer object.
 * API Version: 2020-09-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:datashare:ShareSubscription ShareSubscription1 /subscriptions/433a8dfd-e5d5-4e77-ad86-90acdc75eb1a/resourceGroups/SampleResourceGroup/providers/Microsoft.DataShare/accounts/Account1/sharesubscriptions/ShareSubscription1 
 * ```
 * 
 */
@ResourceType(type="azure-native:datashare:ShareSubscription")
public class ShareSubscription extends io.pulumi.resources.CustomResource {
    /**
     * Time at which the share subscription was created.
     * 
     */
    @Export(name="createdAt", type=String.class, parameters={})
    private Output<String> createdAt;

    /**
     * @return Time at which the share subscription was created.
     * 
     */
    public Output<String> getCreatedAt() {
        return this.createdAt;
    }
    /**
     * The expiration date of the share subscription.
     * 
     */
    @Export(name="expirationDate", type=String.class, parameters={})
    private Output</* @Nullable */ String> expirationDate;

    /**
     * @return The expiration date of the share subscription.
     * 
     */
    public Output</* @Nullable */ String> getExpirationDate() {
        return this.expirationDate;
    }
    /**
     * The invitation id.
     * 
     */
    @Export(name="invitationId", type=String.class, parameters={})
    private Output<String> invitationId;

    /**
     * @return The invitation id.
     * 
     */
    public Output<String> getInvitationId() {
        return this.invitationId;
    }
    /**
     * Name of the azure resource
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the azure resource
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Email of the provider who created the resource
     * 
     */
    @Export(name="providerEmail", type=String.class, parameters={})
    private Output<String> providerEmail;

    /**
     * @return Email of the provider who created the resource
     * 
     */
    public Output<String> getProviderEmail() {
        return this.providerEmail;
    }
    /**
     * Name of the provider who created the resource
     * 
     */
    @Export(name="providerName", type=String.class, parameters={})
    private Output<String> providerName;

    /**
     * @return Name of the provider who created the resource
     * 
     */
    public Output<String> getProviderName() {
        return this.providerName;
    }
    /**
     * Tenant name of the provider who created the resource
     * 
     */
    @Export(name="providerTenantName", type=String.class, parameters={})
    private Output<String> providerTenantName;

    /**
     * @return Tenant name of the provider who created the resource
     * 
     */
    public Output<String> getProviderTenantName() {
        return this.providerTenantName;
    }
    /**
     * Provisioning state of the share subscription
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Provisioning state of the share subscription
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Description of share
     * 
     */
    @Export(name="shareDescription", type=String.class, parameters={})
    private Output<String> shareDescription;

    /**
     * @return Description of share
     * 
     */
    public Output<String> getShareDescription() {
        return this.shareDescription;
    }
    /**
     * Kind of share
     * 
     */
    @Export(name="shareKind", type=String.class, parameters={})
    private Output<String> shareKind;

    /**
     * @return Kind of share
     * 
     */
    public Output<String> getShareKind() {
        return this.shareKind;
    }
    /**
     * Name of the share
     * 
     */
    @Export(name="shareName", type=String.class, parameters={})
    private Output<String> shareName;

    /**
     * @return Name of the share
     * 
     */
    public Output<String> getShareName() {
        return this.shareName;
    }
    /**
     * Gets the current status of share subscription.
     * 
     */
    @Export(name="shareSubscriptionStatus", type=String.class, parameters={})
    private Output<String> shareSubscriptionStatus;

    /**
     * @return Gets the current status of share subscription.
     * 
     */
    public Output<String> getShareSubscriptionStatus() {
        return this.shareSubscriptionStatus;
    }
    /**
     * Terms of a share
     * 
     */
    @Export(name="shareTerms", type=String.class, parameters={})
    private Output<String> shareTerms;

    /**
     * @return Terms of a share
     * 
     */
    public Output<String> getShareTerms() {
        return this.shareTerms;
    }
    /**
     * Source share location.
     * 
     */
    @Export(name="sourceShareLocation", type=String.class, parameters={})
    private Output<String> sourceShareLocation;

    /**
     * @return Source share location.
     * 
     */
    public Output<String> getSourceShareLocation() {
        return this.sourceShareLocation;
    }
    /**
     * System Data of the Azure resource.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return System Data of the Azure resource.
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    /**
     * Type of the azure resource
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Type of the azure resource
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * Email of the user who created the resource
     * 
     */
    @Export(name="userEmail", type=String.class, parameters={})
    private Output<String> userEmail;

    /**
     * @return Email of the user who created the resource
     * 
     */
    public Output<String> getUserEmail() {
        return this.userEmail;
    }
    /**
     * Name of the user who created the resource
     * 
     */
    @Export(name="userName", type=String.class, parameters={})
    private Output<String> userName;

    /**
     * @return Name of the user who created the resource
     * 
     */
    public Output<String> getUserName() {
        return this.userName;
    }

    public interface BuilderApplicator {
        public void apply(ShareSubscriptionArgs.Builder a);
    }
    private static io.pulumi.azurenative.datashare.ShareSubscriptionArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.datashare.ShareSubscriptionArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ShareSubscription(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ShareSubscription(String name) {
        this(name, ShareSubscriptionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ShareSubscription(String name, ShareSubscriptionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ShareSubscription(String name, ShareSubscriptionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:datashare:ShareSubscription", name, args == null ? ShareSubscriptionArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private ShareSubscription(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:datashare:ShareSubscription", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:datashare/v20181101preview:ShareSubscription").build()),
                Output.of(Alias.builder().setType("azure-native:datashare/v20191101:ShareSubscription").build()),
                Output.of(Alias.builder().setType("azure-native:datashare/v20200901:ShareSubscription").build()),
                Output.of(Alias.builder().setType("azure-native:datashare/v20201001preview:ShareSubscription").build()),
                Output.of(Alias.builder().setType("azure-native:datashare/v20210801:ShareSubscription").build())
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
    public static ShareSubscription get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ShareSubscription(name, id, options);
    }
}
