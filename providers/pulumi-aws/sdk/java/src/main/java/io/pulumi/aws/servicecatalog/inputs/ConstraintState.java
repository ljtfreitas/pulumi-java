// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.servicecatalog.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConstraintState extends io.pulumi.resources.ResourceArgs {

    public static final ConstraintState Empty = new ConstraintState();

    /**
     * Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
     * 
     */
    @InputImport(name="acceptLanguage")
    private final @Nullable Input<String> acceptLanguage;

    public Input<String> getAcceptLanguage() {
        return this.acceptLanguage == null ? Input.empty() : this.acceptLanguage;
    }

    /**
     * Description of the constraint.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Owner of the constraint.
     * 
     */
    @InputImport(name="owner")
    private final @Nullable Input<String> owner;

    public Input<String> getOwner() {
        return this.owner == null ? Input.empty() : this.owner;
    }

    /**
     * Constraint parameters in JSON format. The syntax depends on the constraint type. See details below.
     * 
     */
    @InputImport(name="parameters")
    private final @Nullable Input<String> parameters;

    public Input<String> getParameters() {
        return this.parameters == null ? Input.empty() : this.parameters;
    }

    /**
     * Portfolio identifier.
     * 
     */
    @InputImport(name="portfolioId")
    private final @Nullable Input<String> portfolioId;

    public Input<String> getPortfolioId() {
        return this.portfolioId == null ? Input.empty() : this.portfolioId;
    }

    /**
     * Product identifier.
     * 
     */
    @InputImport(name="productId")
    private final @Nullable Input<String> productId;

    public Input<String> getProductId() {
        return this.productId == null ? Input.empty() : this.productId;
    }

    @InputImport(name="status")
    private final @Nullable Input<String> status;

    public Input<String> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    /**
     * Type of constraint. Valid values are `LAUNCH`, `NOTIFICATION`, `RESOURCE_UPDATE`, `STACKSET`, and `TEMPLATE`.
     * 
     */
    @InputImport(name="type")
    private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public ConstraintState(
        @Nullable Input<String> acceptLanguage,
        @Nullable Input<String> description,
        @Nullable Input<String> owner,
        @Nullable Input<String> parameters,
        @Nullable Input<String> portfolioId,
        @Nullable Input<String> productId,
        @Nullable Input<String> status,
        @Nullable Input<String> type) {
        this.acceptLanguage = acceptLanguage;
        this.description = description;
        this.owner = owner;
        this.parameters = parameters;
        this.portfolioId = portfolioId;
        this.productId = productId;
        this.status = status;
        this.type = type;
    }

    private ConstraintState() {
        this.acceptLanguage = Input.empty();
        this.description = Input.empty();
        this.owner = Input.empty();
        this.parameters = Input.empty();
        this.portfolioId = Input.empty();
        this.productId = Input.empty();
        this.status = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConstraintState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> acceptLanguage;
        private @Nullable Input<String> description;
        private @Nullable Input<String> owner;
        private @Nullable Input<String> parameters;
        private @Nullable Input<String> portfolioId;
        private @Nullable Input<String> productId;
        private @Nullable Input<String> status;
        private @Nullable Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ConstraintState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceptLanguage = defaults.acceptLanguage;
    	      this.description = defaults.description;
    	      this.owner = defaults.owner;
    	      this.parameters = defaults.parameters;
    	      this.portfolioId = defaults.portfolioId;
    	      this.productId = defaults.productId;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
        }

        public Builder setAcceptLanguage(@Nullable Input<String> acceptLanguage) {
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        public Builder setAcceptLanguage(@Nullable String acceptLanguage) {
            this.acceptLanguage = Input.ofNullable(acceptLanguage);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setOwner(@Nullable Input<String> owner) {
            this.owner = owner;
            return this;
        }

        public Builder setOwner(@Nullable String owner) {
            this.owner = Input.ofNullable(owner);
            return this;
        }

        public Builder setParameters(@Nullable Input<String> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setParameters(@Nullable String parameters) {
            this.parameters = Input.ofNullable(parameters);
            return this;
        }

        public Builder setPortfolioId(@Nullable Input<String> portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }

        public Builder setPortfolioId(@Nullable String portfolioId) {
            this.portfolioId = Input.ofNullable(portfolioId);
            return this;
        }

        public Builder setProductId(@Nullable Input<String> productId) {
            this.productId = productId;
            return this;
        }

        public Builder setProductId(@Nullable String productId) {
            this.productId = Input.ofNullable(productId);
            return this;
        }

        public Builder setStatus(@Nullable Input<String> status) {
            this.status = status;
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = Input.ofNullable(status);
            return this;
        }

        public Builder setType(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }
        public ConstraintState build() {
            return new ConstraintState(acceptLanguage, description, owner, parameters, portfolioId, productId, status, type);
        }
    }
}
