// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.servicecatalog;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.servicecatalog.ConstraintArgs;
import io.pulumi.aws.servicecatalog.inputs.ConstraintState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages a Service Catalog Constraint.
 * 
 * > **NOTE:** This resource does not associate a Service Catalog product and portfolio. However, the product and portfolio must be associated (see the `aws.servicecatalog.ProductPortfolioAssociation` resource) prior to creating a constraint or you will receive an error.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * `aws_servicecatalog_constraint` can be imported using the constraint ID, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:servicecatalog/constraint:Constraint example cons-nmdkb6cgxfcrs
 * ```
 * 
 */
@ResourceType(type="aws:servicecatalog/constraint:Constraint")
public class Constraint extends io.pulumi.resources.CustomResource {
    /**
     * Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
     * 
     */
    @OutputExport(name="acceptLanguage", type=String.class, parameters={})
    private Output</* @Nullable */ String> acceptLanguage;

    /**
     * @return Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
     * 
     */
    public Output</* @Nullable */ String> getAcceptLanguage() {
        return this.acceptLanguage;
    }
    /**
     * Description of the constraint.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return Description of the constraint.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * Owner of the constraint.
     * 
     */
    @OutputExport(name="owner", type=String.class, parameters={})
    private Output<String> owner;

    /**
     * @return Owner of the constraint.
     * 
     */
    public Output<String> getOwner() {
        return this.owner;
    }
    /**
     * Constraint parameters in JSON format. The syntax depends on the constraint type. See details below.
     * 
     */
    @OutputExport(name="parameters", type=String.class, parameters={})
    private Output<String> parameters;

    /**
     * @return Constraint parameters in JSON format. The syntax depends on the constraint type. See details below.
     * 
     */
    public Output<String> getParameters() {
        return this.parameters;
    }
    /**
     * Portfolio identifier.
     * 
     */
    @OutputExport(name="portfolioId", type=String.class, parameters={})
    private Output<String> portfolioId;

    /**
     * @return Portfolio identifier.
     * 
     */
    public Output<String> getPortfolioId() {
        return this.portfolioId;
    }
    /**
     * Product identifier.
     * 
     */
    @OutputExport(name="productId", type=String.class, parameters={})
    private Output<String> productId;

    /**
     * @return Product identifier.
     * 
     */
    public Output<String> getProductId() {
        return this.productId;
    }
    @OutputExport(name="status", type=String.class, parameters={})
    private Output<String> status;

    public Output<String> getStatus() {
        return this.status;
    }
    /**
     * Type of constraint. Valid values are `LAUNCH`, `NOTIFICATION`, `RESOURCE_UPDATE`, `STACKSET`, and `TEMPLATE`.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Type of constraint. Valid values are `LAUNCH`, `NOTIFICATION`, `RESOURCE_UPDATE`, `STACKSET`, and `TEMPLATE`.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Constraint(String name, ConstraintArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:servicecatalog/constraint:Constraint", name, args == null ? ConstraintArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Constraint(String name, Input<String> id, @Nullable ConstraintState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:servicecatalog/constraint:Constraint", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Constraint get(String name, Input<String> id, @Nullable ConstraintState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Constraint(name, id, state, options);
    }
}
