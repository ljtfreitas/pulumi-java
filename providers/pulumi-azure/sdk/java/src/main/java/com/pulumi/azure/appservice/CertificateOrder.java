// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.appservice.CertificateOrderArgs;
import com.pulumi.azure.appservice.inputs.CertificateOrderState;
import com.pulumi.azure.appservice.outputs.CertificateOrderCertificate;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an App Service Certificate Order.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var exampleResourceGroup = new ResourceGroup(&#34;exampleResourceGroup&#34;, ResourceGroupArgs.builder()        
 *             .location(&#34;West Europe&#34;)
 *             .build());
 * 
 *         var exampleCertificateOrder = new CertificateOrder(&#34;exampleCertificateOrder&#34;, CertificateOrderArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .location(&#34;global&#34;)
 *             .distinguishedName(&#34;CN=example.com&#34;)
 *             .productType(&#34;Standard&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * App Service Certificate Orders can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:appservice/certificateOrder:CertificateOrder example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.CertificateRegistration/certificateOrders/certificateorder1
 * ```
 * 
 */
@ResourceType(type="azure:appservice/certificateOrder:CertificateOrder")
public class CertificateOrder extends com.pulumi.resources.CustomResource {
    /**
     * Reasons why App Service Certificate is not renewable at the current moment.
     * 
     */
    @Export(name="appServiceCertificateNotRenewableReasons", type=List.class, parameters={String.class})
    private Output<List<String>> appServiceCertificateNotRenewableReasons;

    /**
     * @return Reasons why App Service Certificate is not renewable at the current moment.
     * 
     */
    public Output<List<String>> appServiceCertificateNotRenewableReasons() {
        return this.appServiceCertificateNotRenewableReasons;
    }
    /**
     * true if the certificate should be automatically renewed when it expires; otherwise, false. Defaults to true.
     * 
     */
    @Export(name="autoRenew", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> autoRenew;

    /**
     * @return true if the certificate should be automatically renewed when it expires; otherwise, false. Defaults to true.
     * 
     */
    public Output<Optional<Boolean>> autoRenew() {
        return Codegen.optional(this.autoRenew);
    }
    /**
     * State of the Key Vault secret. A `certificates` block as defined below.
     * 
     */
    @Export(name="certificates", type=List.class, parameters={CertificateOrderCertificate.class})
    private Output<List<CertificateOrderCertificate>> certificates;

    /**
     * @return State of the Key Vault secret. A `certificates` block as defined below.
     * 
     */
    public Output<List<CertificateOrderCertificate>> certificates() {
        return this.certificates;
    }
    /**
     * Last CSR that was created for this order.
     * 
     */
    @Export(name="csr", type=String.class, parameters={})
    private Output<String> csr;

    /**
     * @return Last CSR that was created for this order.
     * 
     */
    public Output<String> csr() {
        return this.csr;
    }
    /**
     * The Distinguished Name for the App Service Certificate Order.
     * 
     */
    @Export(name="distinguishedName", type=String.class, parameters={})
    private Output<String> distinguishedName;

    /**
     * @return The Distinguished Name for the App Service Certificate Order.
     * 
     */
    public Output<String> distinguishedName() {
        return this.distinguishedName;
    }
    /**
     * Domain verification token.
     * 
     */
    @Export(name="domainVerificationToken", type=String.class, parameters={})
    private Output<String> domainVerificationToken;

    /**
     * @return Domain verification token.
     * 
     */
    public Output<String> domainVerificationToken() {
        return this.domainVerificationToken;
    }
    /**
     * Certificate expiration time.
     * 
     */
    @Export(name="expirationTime", type=String.class, parameters={})
    private Output<String> expirationTime;

    /**
     * @return Certificate expiration time.
     * 
     */
    public Output<String> expirationTime() {
        return this.expirationTime;
    }
    /**
     * Certificate thumbprint intermediate certificate.
     * 
     */
    @Export(name="intermediateThumbprint", type=String.class, parameters={})
    private Output<String> intermediateThumbprint;

    /**
     * @return Certificate thumbprint intermediate certificate.
     * 
     */
    public Output<String> intermediateThumbprint() {
        return this.intermediateThumbprint;
    }
    /**
     * Whether the private key is external or not.
     * 
     */
    @Export(name="isPrivateKeyExternal", type=Boolean.class, parameters={})
    private Output<Boolean> isPrivateKeyExternal;

    /**
     * @return Whether the private key is external or not.
     * 
     */
    public Output<Boolean> isPrivateKeyExternal() {
        return this.isPrivateKeyExternal;
    }
    /**
     * Certificate key size.  Defaults to 2048.
     * 
     */
    @Export(name="keySize", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> keySize;

    /**
     * @return Certificate key size.  Defaults to 2048.
     * 
     */
    public Output<Optional<Integer>> keySize() {
        return Codegen.optional(this.keySize);
    }
    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created. Currently the only valid value is `global`.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created. Currently the only valid value is `global`.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Specifies the name of the certificate. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Specifies the name of the certificate. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Certificate product type, such as `Standard` or `WildCard`.
     * 
     */
    @Export(name="productType", type=String.class, parameters={})
    private Output</* @Nullable */ String> productType;

    /**
     * @return Certificate product type, such as `Standard` or `WildCard`.
     * 
     */
    public Output<Optional<String>> productType() {
        return Codegen.optional(this.productType);
    }
    /**
     * The name of the resource group in which to create the certificate. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which to create the certificate. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * Certificate thumbprint for root certificate.
     * 
     */
    @Export(name="rootThumbprint", type=String.class, parameters={})
    private Output<String> rootThumbprint;

    /**
     * @return Certificate thumbprint for root certificate.
     * 
     */
    public Output<String> rootThumbprint() {
        return this.rootThumbprint;
    }
    /**
     * Certificate thumbprint for signed certificate.
     * 
     */
    @Export(name="signedCertificateThumbprint", type=String.class, parameters={})
    private Output<String> signedCertificateThumbprint;

    /**
     * @return Certificate thumbprint for signed certificate.
     * 
     */
    public Output<String> signedCertificateThumbprint() {
        return this.signedCertificateThumbprint;
    }
    /**
     * Current order status.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return Current order status.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Duration in years (must be between `1` and `3`).  Defaults to `1`.
     * 
     */
    @Export(name="validityInYears", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> validityInYears;

    /**
     * @return Duration in years (must be between `1` and `3`).  Defaults to `1`.
     * 
     */
    public Output<Optional<Integer>> validityInYears() {
        return Codegen.optional(this.validityInYears);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CertificateOrder(String name) {
        this(name, CertificateOrderArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CertificateOrder(String name, CertificateOrderArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CertificateOrder(String name, CertificateOrderArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:appservice/certificateOrder:CertificateOrder", name, args == null ? CertificateOrderArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CertificateOrder(String name, Output<String> id, @Nullable CertificateOrderState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:appservice/certificateOrder:CertificateOrder", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static CertificateOrder get(String name, Output<String> id, @Nullable CertificateOrderState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CertificateOrder(name, id, state, options);
    }
}
