// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Contains information for manual implementation for an Azure SQL Database, Server or Elastic Pool Recommended Action.
 * 
 */
public final class RecommendedActionImplementationInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final RecommendedActionImplementationInfoResponse Empty = new RecommendedActionImplementationInfoResponse();

    /**
     * Gets the method in which this recommended action can be manually implemented. e.g., TSql, AzurePowerShell.
     * 
     */
    @Import(name="method", required=true)
      private final String method;

    public String getMethod() {
        return this.method;
    }

    /**
     * Gets the manual implementation script. e.g., T-SQL script that could be executed on the database.
     * 
     */
    @Import(name="script", required=true)
      private final String script;

    public String getScript() {
        return this.script;
    }

    public RecommendedActionImplementationInfoResponse(
        String method,
        String script) {
        this.method = Objects.requireNonNull(method, "expected parameter 'method' to be non-null");
        this.script = Objects.requireNonNull(script, "expected parameter 'script' to be non-null");
    }

    private RecommendedActionImplementationInfoResponse() {
        this.method = null;
        this.script = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecommendedActionImplementationInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String method;
        private String script;

        public Builder() {
    	      // Empty
        }

        public Builder(RecommendedActionImplementationInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.method = defaults.method;
    	      this.script = defaults.script;
        }

        public Builder method(String method) {
            this.method = Objects.requireNonNull(method);
            return this;
        }

        public Builder script(String script) {
            this.script = Objects.requireNonNull(script);
            return this;
        }
        public RecommendedActionImplementationInfoResponse build() {
            return new RecommendedActionImplementationInfoResponse(method, script);
        }
    }
}
